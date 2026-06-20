class InsufficientBalanceException extends Exception
{
    int bal;
    int req;

    InsufficientBalanceException(int bal,int req)
    {
        super("Insufficient Balance");

        this.bal = bal;
        this.req = req;
    }
}

public class ATMSystem {

    static void withdraw(int bal,int amt)
            throws InsufficientBalanceException
    {
        if(amt > bal)
            throw new InsufficientBalanceException(bal,amt);

        System.out.println("Withdrawal Success");
    }

    public static void main(String[] args)
    {
        try
        {
            withdraw(5000,8000);
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Balance : " + e.bal);
            System.out.println("Requested : " + e.req);
        }
    }
}