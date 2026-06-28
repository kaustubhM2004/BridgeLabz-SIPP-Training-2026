import java.util.Scanner;

public class BMItracker {

    static void calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else
            System.out.println("Overweight");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double height = sc.nextDouble();
        double weight = sc.nextDouble();

        calculateBMI(weight, height);

        sc.close();
    }
}