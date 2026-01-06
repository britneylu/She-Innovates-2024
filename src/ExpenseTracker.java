import java.util.Scanner;
import java.util.Map;

public class ExpenseTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Expense Tracker!");
        System.out.print("Enter your total semester loan amount: $");
        double loan = scanner.nextDouble();

        while (loan <= 0) {
            System.out.print("Please enter a valid amount: $");
            loan = scanner.nextDouble();
        }

        Student student = new Student(loan);
        boolean exit = false;

        while (!exit) {
            Interface.showMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Interface.showCategories();
                    int catChoice = scanner.nextInt();
                    String category = Interface.getCategoryFromChoice(catChoice);

                    System.out.print("Enter expense amount: $");
                    double amount = scanner.nextDouble();

                    if (student.addExpense(category, amount)) {
                        System.out.println("Expense added successfully.");
                    } else {
                        System.out.println("Invalid expense or insufficient balance.");
                    }
                    break;

                case 2:
                    System.out.printf("Remaining Balance: $%.2f%n",
                            student.getRemainingBalance());
                    break;

                case 3:
                    System.out.println("\n--- Expense Breakdown ---");
                    for (Map.Entry<String, Double> entry : student.getCategoryExpenses().entrySet()) {
                        System.out.printf("%s: $%.2f%n",
                                entry.getKey(), entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("\n--- Expense Statistics ---");
                    System.out.printf("Total Spent: $%.2f%n",
                            student.getTotalSpent());
                    System.out.printf("Average Expense: $%.2f%n",
                            student.getAverageExpense());
                    break;

                case 5:
                    exit = true;
                    System.out.println("\nThank you for using the Expense Tracker!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}