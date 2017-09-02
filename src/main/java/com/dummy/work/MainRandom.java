package com.dummy.work;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainRandom {

    public static void main(String[] args) {

        Random random = new Random();                
        int val = random.nextInt(25);
        
        int randomNum = ThreadLocalRandom.current().nextInt(17, 23 + 1);
        
        System.out.println(randomNum);

    }

}
