public class Student
{
    private double sal; // per month
    private double board;   // per semester
    private double food;    // per semester

    private double totalL;
    private double personal;

    private double sav; // percent of total
    private double totalSaved;


    // constructor method
    public Student(double salary, double boardFee, double foodFee, double savings)
    {
        this.sal = salary;
        this.board = boardFee;
        this.food = foodFee;

        this.totalL = 0.00;
        this.personal = 0.00;

        this.sav = savings;
        this.totalSaved = 0.00;
    }

    public double budget()
    {
        this.totalL = sal * 4;
        this.totalL -= board;
        this.totalL -= food;
        
        this.totalSaved = totalL * (sav/100);
        
        this.totalL -= this.totalSaved;
        return this.totalL;
    }

    public double getTotalSaved()
    {
        return this.totalSaved;
    }

    public boolean expenditure(double spent)
    {
        double tempP = this.personal - spent;
        double tempT = this.totalL - tempP;

        if(tempT < 0)
        {
            return false;
        }

        this.personal = tempP;
        this.totalL = tempT;
        return true;
    }
}