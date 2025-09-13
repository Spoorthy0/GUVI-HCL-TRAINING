class Account{
    private String accountNum;
    private String accHolderName;
    private double balance;
    static long nextAccnum;
    static int totalAcc;
    public Account(String accountNum, String accHolderName, double balance){
        this.accountNum=accountNum;
        this.accHolderName=accHolderName;
        this.balance=balance;
        totalAcc+=1;
       nextAccnum=(long)Math.random();
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
        }
    }

}
public class BankAcc {
    public static void main(String[] args) {
        Account acc = new Account("!@2#", "Spoorthy", 2300.67);
        acc.deposit(800);
        acc.withdraw(900);
        Account acc1=new Account("!@2$", "John", 1500.00);
    
        System.out.println(acc.getAccountNum());
        System.out.println(acc.getAccHolderName());
        System.out.println(acc.getBalance());
        System.out.println(Account.totalAcc);
        System.out.println(Account.nextAccnum);

    }
}
