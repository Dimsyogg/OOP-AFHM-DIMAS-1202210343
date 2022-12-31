import java.util.Scanner;
import java.util.InputMismatchException;

public class MainaApp {
  public static void main(String[] args) {
    boolean repeat = true;
    Scanner scanner = new Scanner(System.in);
    Calculation calculation = new Calculation();

    do {
      try {
        System.out.println("=== Menu Program ===");
        System.out.println("1. Square\n2. Circle\n3. Trapezoid");
        System.out.println("Select Menu: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
          case 1:
            System.out.println("Enter the lenght of the side of the square :");
            double sisi = scanner.nextDouble();
            calculation.setSquare(sisi);
            calculation.run();
            System.out.println("The Calculation result : " + calculation.getSquare());
            break;
          case 2:
            System.out.println("ENter the radius of the circle : ");
            double radius = scanner.nextDouble();
            calculation.setCircle(radius);
            calculation.run();
            System.out.println("The Calculation result : " + calculation.getCircle());
            break;
          case 3:
            System.out.print("Insert the side of the base of the trapezoid : ");
            System.out.print("Enter the upper side of the trapezoid : ");
            System.out.print("Enter the height of the trapezoid : ");
            calculation.run();
            System.out.println("Te calculation: " + calculation.getTrapezoid());
            break;
          case 0:
            System.out.println("Program has ended");
            break;
          default:
            System.out.println("Option not avaible");
            continue;
        }
        repeat = false;
      } catch (InputMismatchException e) {
        System.out.println("\nError, input must be Integer");
        scanner.next();
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
      } 
    } while (repeat);

    scanner.close();
  }
}
