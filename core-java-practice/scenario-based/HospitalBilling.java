class InsufficientFundsException extends Exception
{
    InsufficientFundsException(String msg)
    {
        super(msg);
    }
}

public class HospitalBilling {

    public static void main(String[] args)
    {
        try
        {
            int items = 0;

            int amt = 1000 / items;

            int p[] = {1,2,3};

            System.out.println(p[5]);

            int x = Integer.parseInt("abc");

        }
        catch(ArithmeticException e)
        {
            System.out.println("Bill cannot have zero items");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid patient index");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Bad input entered");
        }

        try
        {
            int bal = 1000;
            int pay = 2000;

            if(pay > bal)
                throw new InsufficientFundsException("Payment failed");
        }
        catch(InsufficientFundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
}