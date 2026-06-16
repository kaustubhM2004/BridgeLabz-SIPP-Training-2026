import java.util.Scanner;

public class RestaurantBillingSystem
{

double foodCost,gst,discount,finalBill;

void calculateFoodCost(int qty,double price)
{
foodCost = qty * price;
}

void calculateGST()
{
gst = foodCost * 0.18;
}

void calculateDiscount()
{
if(foodCost > 1000)
discount = foodCost * 0.10;
else
discount = 0;
}

void generateBill()
{
finalBill = foodCost + gst - discount;

System.out.println("\nRestaurant Bill");
System.out.println("Food Cost = " + foodCost);
System.out.println("GST = " + gst);
System.out.println("Discount = " + discount);
System.out.println("Final Bill = " + finalBill);
}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter Quantity : ");
int q = sc.nextInt();

System.out.print("Enter Price per Item : ");
double p = sc.nextDouble();

RestaurantBillingSystem obj = new RestaurantBillingSystem();

obj.calculateFoodCost(q,p);

 obj.calculateGST();

obj.calculateDiscount();

obj.generateBill();

}

}