package org.example.lambda;

class ThreadDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("run method called");
    }
}

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = ()-> {
            System.out.println("run method called using the lambda function");
        };
        Thread lambdaThread = new Thread(runnable);
        lambdaThread.start();

        Thread lambdaT1 = new Thread(()-> System.out.println("passing lambda in parameter"));
    }

}
