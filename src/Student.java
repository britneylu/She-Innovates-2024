import java.util.HashMap;
import java.util.ArrayList;

public class Student {
    private double totalLoan;
    private double remainingBalance;

    private HashMap<String, Double> categoryExpenses;
    private ArrayList<Double> expenseHistory;

    public Student(double totalLoan) {
        this.totalLoan = totalLoan;
        this.remainingBalance = totalLoan;
        this.categoryExpenses = new HashMap<>();
        this.expenseHistory = new ArrayList<>();

        // Initialize categories
        categoryExpenses.put("Food", 0.0);
        categoryExpenses.put("Transportation", 0.0);
        categoryExpenses.put("Entertainment", 0.0);
        categoryExpenses.put("School Supplies", 0.0);
        categoryExpenses.put("Other", 0.0);
    }

    public boolean addExpense(String category, double amount) {
        if (amount <= 0 || amount > remainingBalance) {
            return false;
        }

        remainingBalance -= amount;
        categoryExpenses.put(category, categoryExpenses.get(category) + amount);
        expenseHistory.add(amount);
        return true;
    }

    public double getRemainingBalance() {
        return remainingBalance;
    }

    public double getTotalSpent() {
        return totalLoan - remainingBalance;
    }

    public HashMap<String, Double> getCategoryExpenses() {
        return categoryExpenses;
    }

    public ArrayList<Double> getExpenseHistory() {
        return expenseHistory;
    }

    public double getAverageExpense() {
        if (expenseHistory.isEmpty())
            return 0;
        double sum = 0;
        for (double e : expenseHistory) {
            sum += e;
        }
        return sum / expenseHistory.size();
    }
}