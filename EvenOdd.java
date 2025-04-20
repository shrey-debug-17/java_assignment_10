// function to print even and odd numbers between 1 to 10
public class EvenOdd implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
            try {
                Thread.sleep(600); // pause for 600ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}