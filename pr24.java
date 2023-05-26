class InsufficientFundsException extends Exception
{
private double amount;
public InsufficientFundsException(double amount)
{
this.amount = amount;
}
public double getAmount()
{
return amount;
}
}
class CheckingAccount
{
private double balance;
private int number;
public CheckingAccount(int number) 
{
this.number = number;
}
public void deposit(double amount)
{
balance += amount;
}
public void withdraw(double amount) throws InsufficientFundsException
{
if(amount <= balance)
{
balance -= amount;
}
else
{
double needs = amount - balance;
throw new InsufficientFundsException(needs);
}
}
public double getBalance()
{
return balance;
}
public int getNumber()
{
return number;
}
}
public class pr24 
{
public static void main(String args[])
{
CheckingAccount c = new CheckingAccount(101);
System.out.println("Depositing 25000...");
c.deposit(25000.00);
try 
{
System.out.println("\nWithdrawing 20000...");
c.withdraw(20000.00);
System.out.println("\nWithdrawing 4000...");
c.withdraw(6000.00);
} 
catch(InsufficientFundsException e)
{
System.out.println("Sorry, but you are short Rupee" + e.getAmount());
e.printStackTrace();
}
}
}