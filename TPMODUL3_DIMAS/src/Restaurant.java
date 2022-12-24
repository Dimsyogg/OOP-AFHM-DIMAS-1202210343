public class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;
    @Override
    public void run() {
        // call makeFood method and pending it to 5000 ms
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }
    public static int getFoodNumber() {
        return foodNumber;
    }
    public void makeFood() {
        synchronized(Restaurant.lock) {
            // check if waitingForPickup is true so call method lock.wait() to lock for thread
            // so process not to continue before waiter deliver food
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Menunggu waiter untuk menghidangkan makanan");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // to inform another thread that another food is ready to deliver
            waitingForPickup = true;
            System.out.println("Restaurant:  Membuat makanan ke " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Memberi tahu waiter untuk mengambil makanan\n");
        }
    }
    public static Object getLock() {
        return lock;
    }
}