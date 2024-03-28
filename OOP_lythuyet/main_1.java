public class main_1
{
    public static void main(String[] args) 
    {
        // normal account
        Bank_acc normalAccount = new Bank_acc("Nguyen Van A", "123456789", 100000);

        normalAccount.Increase(300000);

        normalAccount.deposition(260000);// ko dc
        normalAccount.deposition(50000);// ok
        System.out.println("Remaining balance: " + normalAccount.getBalance());

        int amount = 40000;
        normalAccount.withdraw(amount);
        if ( normalAccount.getBalance() > 0) {
            System.out.println("Withdrawn amount: " + amount);
            System.out.println("Remaining balance: " + normalAccount.getBalance());
        }

        // saving account
        Saving_acc savingAccount = new Saving_acc("Nguyen Thi B", "987654321", 5000000, 0.06); // Annual interest rate is 6%

        double monthlyInterest = savingAccount.MonthlyInterest();
        System.out.println("Monthly interest: " + monthlyInterest);

        savingAccount.deposition(100000);

        savingAccount.withdraw(200000); //  withdrawal is not allowed from saving account
    }
}
