import java.util.Scanner;

public class Coffee_Counter_Chronicles {

    static double getPrice(String coffee) {
        switch (coffee.toLowerCase()) {
            case "espresso":
                return 120;
            case "latte":
                return 150;
            case "cappuccino":
                return 180;
            default:
                return 0;
        }
    }

    static double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    static double calculateGST(double bill) {
        return bill * 0.18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter coffee type (espresso, latte, cappuccino) or exit: ");
            String coffee = sc.next();

            if (coffee.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double price = getPrice(coffee);

            if (price == 0) {
                System.out.println("Invalid Coffee Type");
                continue;
            }

            double bill = calculateBill(price, quantity);
            double gst = calculateGST(bill);
            double total = bill + gst;

            System.out.println("Bill = " + bill);
            System.out.println("GST = " + gst);
            System.out.println("Total Bill = " + total);
        }

        System.out.println("Cafe Closed");
        sc.close();
    }
}