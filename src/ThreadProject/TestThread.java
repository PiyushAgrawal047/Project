package ThreadProject;
//there are two method to create thread
//First Method-by extending thread class
public class TestThread extends Thread{
    public void run(){
        System.out.println("You have started thread-by extending thread class ");
    }

    public static void main(String[]args){
        TestThread th=new TestThread();
        th.start();

        Test1 test1=new Test1();
        Thread t=new Thread(test1);
        t.start();
    }
}

//second method-by implement Runnable inteface

class Test1 implements Runnable{
    public void run(){
        System.out.println("Enterd in Thread -by implementing Runnable interface ");
    }
}
