
public class Bank_acc {

    private String name;
    private String acc_num;
    private double balance;

    public Bank_acc(String name, String acc_num, double balance) {
        this.name = name;
        this.acc_num = acc_num;
        this.balance = balance;
    }

    public void Increase(double money) 
    {
        if(money > 0){
        this.balance += money;
        System.out.printf("Da cong them vao tai khoan %.2f VND\n",money);
        }
    }

    public void Decrease(double money) 
    {
        if(money > 0)
        if (this.balance - money > 50000) {
            this.balance -= money;
            System.out.printf("Da tru di vao tai khoan %.2f VND\n",money);
        }
        else
        {
            System.out.printf("So du tai khoan luon co it hat 50000 VND\n");
        }
    }

    public void deposition(double money)
    {
        Increase(money);
    }

    public void withdraw(double amount) 
    {
        if (amount > 0) {
            double withdrawalFee = 5000;
            double totalWithdrawal = withdrawalFee + amount;
            if(totalWithdrawal + 50000 <= this.balance)
            {
                this.balance -= amount;
                System.out.printf("Da rut di vao tai khoan %.2f VND\n",amount);
            }
            else
            {
                System.out.printf("So du tai khoan khong du, luon co it hat 50000 VND\n");
            }
        }
    }

    public double getBalance() {
        return balance;
    }

}
