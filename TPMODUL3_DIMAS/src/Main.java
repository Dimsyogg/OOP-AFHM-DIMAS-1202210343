import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant Chef = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.print("Masukkan Customer ID: ");
                customerID = input.nextInt();

                System.out.print("Masukkan Jumlah Makanan yang akan dibuat: ");
                orderQty = input.nextInt();

                Thread t1 = new Thread(Chef);
                Waiters waiter = new Waiters(customerID, orderQty);
                Thread t2 = new Thread(waiter);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

            } catch (Exception e) {
                System.out.println("\n==========PERINGATAN !!!===========");
                System.out.println("Input harus berupa bilangan Integer\n");
            }
        }

    }

}
