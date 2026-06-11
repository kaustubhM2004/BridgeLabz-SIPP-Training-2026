import java.util.*;
public class MetroFare {
public static void main(String[] args) {
        double balance = 600.00;
        while(balance>0){
            System.out.println("-------------------------------------------");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Distance in KM or Type -1 to exit");
            double distance = sc.nextDouble();
            System.out.println("Enter the number of passengers: ");
            int passenger =sc.nextInt();
            if(distance==-1) {
                break;
            }

        //Fare Calculation using Ternary Operator:
        double fare = (distance<=5)?10:(distance<=10)?20: (distance<=20)?30:50;

        //Balance Calculation
        if(balance>fare){
            fare*=passenger;
            balance-=fare;
            System.out.print("Available Balance in your card is:- "+balance+ "\n");
        }
        else{
            System.out.println("Insufficient Balance Please check your Card Balance!!!");
        }
        System.out.println("Thank you for travelling in Lucknow Metro.");
        System.out.println("-------------------------------------------");
        }
        System.out.println("Card limit Exceeded or Balance is Zero!!!");
    }
}