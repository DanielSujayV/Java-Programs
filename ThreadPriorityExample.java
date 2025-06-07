class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running.");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Low Priority Thread");
        PriorityThread t2 = new PriorityThread("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
