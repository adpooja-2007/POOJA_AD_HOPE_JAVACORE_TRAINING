public class Threads {

}

class SampleThread extends Thread {
    @Override

    public void run() {
        System.out.println("Thread running using Thread class");
    }
}

class SampleThread2 implements Runnable {
    @Override
    public void run()
    {
        try {
            System.out.println("Thread running using runnable");
            Thread.sleep(4000);
            System.out.println("After 4 secondsss");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class Threads {

    public static void main(String[] args) {
        SampleThread t = new SampleThread();
        t.start();
        SampleThread2 s = new SampleThread2();
        Thread t2 = new Thread(s);
        t2.start();
    }
}