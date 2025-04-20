// Name: Shrey Ardeshana
// PRN: 23070126019
// Batch: A1

public class Main {
    public static void main(String[] args) {
        // creating thread objects
        Thread t1 = new Thread(new Numbers());
        Thread t2 = new Thread(new Alphabet());
        Thread t3 = new Thread(new EvenOdd());

        // starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}