public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 50000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;    
    }

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("\n                     ESD RESTAURANT                       ");
        System.out.println("============================================================");
        System.out.println("Customer ID    :                                      " + this.customerID);
        System.out.println("Number of Food :                                      " + this.orderQty);
        System.out.println("Total Price    :                                      " + this.orderQty * foodPrice);
        System.out.println("============================================================");
    }

    public void makeFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Makanan siap untuk diantarkan");
            Restaurant chef = new Restaurant();
            chef.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Memberi pesan kepada Restoran untuk membuat makanan lain\n");
        }
    }
}
