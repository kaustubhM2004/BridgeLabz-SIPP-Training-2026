public class DeliveryChargeSystem {

    static double calculateCharge(int distance) {
        return distance*5;
    }
    static double calculateCharge(int distance,int weight) {
return (distance*5) +(weight*10);
    }
    static double calculateCharge(int distance, int weight, boolean expressDelivery) {
        double charge = (distance *5) + (weight*10);

        if (expressDelivery)
            charge += 100;
        return charge;}
    public static void main(String[] args) {
        System.out.println("Charge 1: Rs." + calculateCharge(10));
        System.out.println("Charge 2: Rs." + calculateCharge(10, 5));
        System.out.println("Charge 3: Rs." + calculateCharge(10, 5, true));
    }
}