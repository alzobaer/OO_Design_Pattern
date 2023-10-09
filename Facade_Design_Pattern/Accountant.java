import java.util.Scanner;

// Client class to use the BankingServiceFacade
public class Accountant {
    public static void main(String[] args) {
        BankingServiceFacade bankingService = new BankingServiceFacade();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an account to access:");
            System.out.println("1. Checking Account");
            System.out.println("2. Savings Account");
            System.out.println("3. Investment Account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bankingService.accessChecking();
                    break;
                case 2:
                    bankingService.accessSavings();
                    break;
                case 3:
                    bankingService.accessInvestment();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
