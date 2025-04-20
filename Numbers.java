// function to print numbers from 1 to 5
public class Numbers implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // pause for half second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}