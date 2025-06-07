class LibraryThread extends Thread {
    static int availableBooks = 10; // Shared among all threads

    public void run() {
        if (availableBooks > 0) {
            availableBooks--;
            System.out.println(Thread.currentThread().getName() + " borrowed a book. Books left: " + availableBooks);
        } else {
            System.out.println("No books available for " + Thread.currentThread().getName());
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryThread t1 = new LibraryThread();
        LibraryThread t2 = new LibraryThread();
        LibraryThread t3 = new LibraryThread();

        t1.start();
        t2.start();
        t3.start();
    }
}

