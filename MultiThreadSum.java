class SumThread extends Thread {
    int start, end, sum = 0;

    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }
}

public class MultiThreadSum {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(1, 10);
        SumThread t2 = new SumThread(11, 20);
        SumThread t3 = new SumThread(21, 30);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {}

        int totalSum = t1.sum + t2.sum + t3.sum;
        System.out.println("Final Sum: " + totalSum);
    }
}

