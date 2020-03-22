package com.dummy.work;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinMain1 extends RecursiveAction {
    
    public static void main(String[] args) {
        ForkJoinMain1 myRecursiveAction = new ForkJoinMain1(24);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(myRecursiveAction);
    }

    private long workLoad = 0;

    public ForkJoinMain1(long workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    protected void compute() {

        //if work is above threshold, break tasks up into smaller tasks
        if(this.workLoad > 8) {
            System.out.println("Splitting workLoad : " + this.workLoad);

            List<ForkJoinMain1> subtasks =
                new ArrayList<ForkJoinMain1>();

            subtasks.addAll(createSubtasks());

            
            for(RecursiveAction subtask : subtasks){
                subtask.fork();
            }

        } else {
            System.out.println("Doing workLoad myself: " + this.workLoad);
        }
    }

    private List<ForkJoinMain1> createSubtasks() {
        List<ForkJoinMain1> subtasks =
            new ArrayList<ForkJoinMain1>();

        ForkJoinMain1 subtask1 = new ForkJoinMain1(this.workLoad / 2);
        ForkJoinMain1 subtask2 = new ForkJoinMain1(this.workLoad / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

        return subtasks;
    }

}
