package com.dummy.fibo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.dummy.fibo.IFibonacciApi;

public class FibonacciAPIThreads implements IFibonacciApi {

	private final ConcurrentMap<Integer, Integer> fibonacciMap = new ConcurrentSkipListMap<Integer, Integer>();
	private int availableProcessors = Runtime.getRuntime().availableProcessors(); 
	
	public List<Integer> generateSequence(final int startingFrom, final short numberOfTerms) {
		int requiredFibonacciSequenceSize = startingFrom + numberOfTerms;
		ExecutorService executorService = Executors.newFixedThreadPool(availableProcessors);
		
		int i= startingFrom;
		while (i < requiredFibonacciSequenceSize) {
			final int j = i++;
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					fibonacciMap.put(j, calculateTerm(j));
				}
			});
		}
		
		executorService.shutdown();
		while (!executorService.isTerminated()) {}
		return new ArrayList<Integer>(fibonacciMap.values()).subList(startingFrom, startingFrom + numberOfTerms);
	}
	
	private int calculateTerm(int i) {
		if (fibonacciMap.containsKey(i)) return fibonacciMap.get(i); 
		if (i==0) return 0;
		if (i==1) return 1;
		return calculateTerm(i-1) + calculateTerm(i-2);			
	}	
	
}
