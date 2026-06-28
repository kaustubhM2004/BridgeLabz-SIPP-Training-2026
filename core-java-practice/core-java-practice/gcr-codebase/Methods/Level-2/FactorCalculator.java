import java.util.Scanner;

public class FactorCalculator
{

static int[] getFactors(int number)
{
int count = 0;

for(int i=1;i<=number;i++)
{
if(number%i==0)
count++;
}

int factors[] = new int[count];
int index = 0;

for(int i=1;i<=number;i++)
{
if(number%i==0)
{
factors[index] = i;
index++;
}
}

return factors;
}

static int getSum(int factors[])
{
int sum = 0;

for(int i=0;i<factors.length;i++)
sum += factors[i];

return sum;
}

static int getProduct(int factors[])
{
int product = 1;

for(int i=0;i<factors.length;i++)
product *= factors[i];

return product;
}

static double getSquareSum(int factors[])
{
double sum = 0;

for(int i=0;i<factors.length;i++)
sum += Math.pow(factors[i],2);

return sum;
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter Number : ");
int number = sc.nextInt();

int factors[] = getFactors(number);

System.out.print("Factors : ");

for(int i=0;i<factors.length;i++)
System.out.print(factors[i]+" ");

System.out.println("\nSum = "+getSum(factors));
System.out.println("Product = "+getProduct(factors));
System.out.println("Sum of Squares = "+getSquareSum(factors));

}
}