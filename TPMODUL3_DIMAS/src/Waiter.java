public class Waiter implements Runnable {
    private final int orderQty;
    private final int customerID;
    static int foodPrice = 50000;

    public Waiter(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }
    @Override
    public void run() {
        // call getFood method and pending it to 15000 ms
        while (true) {
            getFood();
            try {
                Thread.sleep(15000);
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
    // create synchronized method getFood
    public void getFood() {
        synchronized(Restaurant.getLock()) {
            System.out.println("Waiter: Makanan siap untuk di hidangkan");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);
            // check if value of getFoodNumber form Restaurant class is equal to orderQty
            // if same, call method orderInfo() to print order info and exit the program
            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Memberi tahu Restauran untuk membuat makanan lain\n");

        }
    }
}

