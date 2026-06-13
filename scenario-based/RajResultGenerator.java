import java.util.Scanner;

public class RajResultGenerator {

    static void grade(double avg) {
        switch ((int) avg / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
            case 7:
                System.out.println("Grade B");
                break;
            case 6:
                System.out.println("Grade C");
                break;
            case 5:
            case 4:
                System.out.println("Grade D");
                break;
            default:
                System.out.println("Grade F");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            total += sc.nextInt();
        }

        double avg = total / 5.0;

        System.out.println("Average = " + avg);
        grade(avg);

        sc.close();
    }
}g