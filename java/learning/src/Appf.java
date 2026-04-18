public class Appf {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        Thread t = new Thread(t1);
        A t2 = new A();
        B t3 = new B();
        C t4 = new C();

        t.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class MyThread implements Runnable {
    public void run(){
        System.out.println("Thread is running");
    }
}

class A extends Thread {
    public void run(){
        for(int i = 0 ; i <= 5; i++){
            System.out.println("A: " + i);
        }
    }
}

class B extends Thread {
    public void run(){
        for(int i = 0; i <= 10; i++){
            System.out.println("B: "  + i);

            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}

class C extends Thread {
    public void run(){
        for(int i = 0; i <= 15; i++){
            System.out.println("C: " + i);
        }
    }
}