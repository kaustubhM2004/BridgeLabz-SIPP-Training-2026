import java.util.Scanner;
public class ElectricityBillCalculator {
   int units;
   double bill;
   void acceptUnits(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter units consumed: ");
      units = sc.nextInt();
   }
    void calculateBill(){
      if(units <= 100)
         bill = units * 1.5;
      else if(units <= 300)
          bill = 100 * 1.5 + (units - 100) * 2.5;
      else
        bill = 100 * 1.5 + 200 * 2.5 + (units - 300) * 4;
   }
 void displayBill(){
    System.out.println("\nElectricity Bill Details");
    System.out.println("Units Consumed : " + units);
    System.out.println("Bill Amount : ₹" + bill);
 }

 public static void main(String args[]){

    ElectricityBillCalculator e = new ElectricityBillCalculator();

      e.acceptUnits();
    e.calculateBill();
       e.displayBill();
 }
}