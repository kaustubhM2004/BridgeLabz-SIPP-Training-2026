import java.util.Scanner;

public class BMITrackerTeam {

    static String getStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else
            return "Overweight";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        System.out.println("Weight Height BMI Status");

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100;
            double bmi = weight / (height * height);

            System.out.println(weight + " " + data[i][1] + " " + bmi + " " + getStatus(bmi));
        }

        sc.close();
    }
}