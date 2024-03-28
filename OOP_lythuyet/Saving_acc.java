
public class Saving_acc extends Bank_acc{

    private double annualInterestRate; // Lãi suất hàng năm

    public Saving_acc(String ownerName, String accountNumber, double initialBalance, double annualInterestRate) 
    {
        super(ownerName, accountNumber, initialBalance);
        this.annualInterestRate = annualInterestRate;
    }

    public double MonthlyInterest() 
    {
        return getBalance() * annualInterestRate / 12;
    }

    @Override
    public void withdraw(double amount) 
    {
        System.out.println("Withdrawal not allowed from saving account.");
    }
}
