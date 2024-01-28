import java.util.*;

public class ExpenseTracker
{
    public static void main(String [] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.print("Enter Salary/Income Per Month : $");
        double salary = myObj.nextDouble();

        System.out.print("Enter Housing Fee Per Semester : $");
        double board = (double)  myObj.nextDouble();
        
        System.out.print("Enter Total Dining Expenses Per Semester : $");
        double food = (double) myObj.nextDouble();

        System.out.print("Enter the Percentage You Wish to Save (no %): ");
        double savePercent = myObj.nextDouble();
        
        Student student1 = new Student(salary, board, food, savePercent);
        System.out.println("\nYou can spend $" + student1.budget() + " per semester!");
        System.out.println("You are projected to save $" + student1.getTotalSaved() + " per semester!\n");

        new Interface(student1);

        /*while(true)
        {
            System.out.print("Enter expense amount: $");
            double amount = myObj.nextDouble();

            if(amount >= 0.00 && !student1.expenditure(amount))
            {
                System.out.println("WARNING: YOU HAVE EXCEEDED YOUR BUDGET!");
            }
            else
            {
                break;
            }
        } */
        
        myObj.close();
    }
}