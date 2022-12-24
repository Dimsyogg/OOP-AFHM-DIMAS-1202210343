import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant chef = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.print("Masukkan Customer ID: ");
                customerID = input.nextInt();

                System.out.print("Masukkan jumlah makanan yang akan dipesan: ");
                orderQty = input.nextInt();

                Thread t1 = new Thread(chef);
                Waiter waiter = new Waiter(customerID, orderQty);
                Thread t2 = new Thread(waiter);

                t1.start();
                t2.start();
                t1.join();
                t2.join();

            } catch (Exception e) {
                System.out.println("========Peringatan========");
                System.out.println("Input harus berupa integer");
            }
        }

    }

}
