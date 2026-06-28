import java.util.Scanner;

public class ElectionBoothManager {

    static boolean canVote(int age) {
        return age >= 18;
    }

    static void vote(int choice) {
        if (choice == 1)
            System.out.println("Vote recorded for Candidate 1");
        else if (choice == 2)
            System.out.println("Vote recorded for Candidate 2");
        else if (choice == 3)
            System.out.println("Vote recorded for Candidate 3");
        else
            System.out.println("Invalid Vote");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter age (0 to exit): ");
            int age = sc.nextInt();

            if (age == 0)
                break;

            if (canVote(age)) {
                System.out.print("Enter vote (1, 2, 3): ");
                int choice = sc.nextInt();
                vote(choice);
            } else {
                System.out.println("Not Eligible to Vote");
            }
        }

        sc.close();
    }
}