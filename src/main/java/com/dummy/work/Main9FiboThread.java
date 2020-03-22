package com.dummy.work;

public class Main9FiboThread extends Thread {
    
    private int x;
    public int answer;

    public Main9FiboThread(int x) {
        this.x = x;
    }
    
    public void run() {
        if( x <= 2 )
            answer = 1;
        else {
            try {
                Main9FiboThread f1 = new Main9FiboThread(x-1);
                Main9FiboThread f2 = new Main9FiboThread(x-2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                answer = f1.answer + f2.answer;
                System.out.println(answer);
            }
            catch(InterruptedException ex) { }
        }
    }
    
    public static void main(String[] args) throws Exception {
        try {
            //Main9FiboThread f = new Main9FiboThread( Integer.parseInt(args[0]) );
            Main9FiboThread f = new Main9FiboThread( 5 );
            f.start();
            f.join();
            System.out.println(f.answer);
        }
        catch(Exception e) {
            System.out.println("usage: java Fib NUMBER");
        }

    }

}
