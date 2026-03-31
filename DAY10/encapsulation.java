package DAY10;
class BankAccount{
    public double balance;
}
public class encapsulation{
    public static void main(String[] args)
    {
        BankAccount b =  new BankAccount();
        b.balance += 1000;
        System.out.println(" BALANCE: "+b.balance);
    }
}