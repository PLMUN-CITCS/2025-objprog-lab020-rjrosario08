import java.util.Scanner;

public class MenuDrivenProgram {

    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    public static void handleMenuChoice(int choice) {
        Scanner scanner = new Scanner(System.in);

        if (choice == 1) {
            greetUser();
        } else if (choice == 2) {
            checkEvenOrOdd(scanner);
        } else if (choice == 3) {
            System.out.println("Exiting program. Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

      public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();
     }
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                handleMenuChoice(choice);
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next();
            }
        }
    }
}
