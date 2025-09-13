class Account{
    private double balance;
    public Account(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account acc1=new Account(234);
        System.out.println(acc1.getBalance());
    }
}
