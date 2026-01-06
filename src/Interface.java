public class Interface {

    public static void showMenu() {
        System.out.println("\n===== EXPENSE TRACKER MENU =====");
        System.out.println("1. Add Expense");
        System.out.println("2. View Balance");
        System.out.println("3. View Category Breakdown");
        System.out.println("4. View Expense Statistics");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public static void showCategories() {
        System.out.println("\nChoose a category:");
        System.out.println("1. Food");
        System.out.println("2. Transportation");
        System.out.println("3. Entertainment");
        System.out.println("4. School Supplies");
        System.out.println("5. Other");
        System.out.print("Category: ");
    }

    public static String getCategoryFromChoice(int choice) {
        switch (choice) {
            case 1:
                return "Food";
            case 2:
                return "Transportation";
            case 3:
                return "Entertainment";
            case 4:
                return "School Supplies";
            default:
                return "Other";
        }
    }
}