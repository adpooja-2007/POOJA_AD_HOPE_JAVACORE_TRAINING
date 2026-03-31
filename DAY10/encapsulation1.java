package DAY10;
class BankAccount1{
    private double balance;
    public void setBalance(double balance){
        if(balance>0)
        this.balance = balance;
        else 
            System.out.println("inputb not valid");
    }
    public void withdraw(int amt){
        if(amt<=balance)
            balance -=amt;
        else
            System.out.println("BALANCE REMAINIMG");
    }
    public void deposit(int amt){
        if(amt>0){
            balance+=amt;
        }
        System.out.println("BALANCE UPDATED" );
    }
    public double getBalance(){
        return balance;
    }
}
public class encapsulation1{
    public static void main(String[] args)
    {
        BankAccount1 b =  new BankAccount1();
        b.setBalance(1000);
        System.out.println(" BALANCE: "+b.getBalance());
        b.withdraw(90);
        System.out.println(" BALANCE: "+b.getBalance()); 
        b.deposit(100);
        System.out.println(" BALANCE: "+b.getBalance());
    }
}