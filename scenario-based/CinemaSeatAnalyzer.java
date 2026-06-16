import java.util.Scanner;

public class CinemaSeatAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] seats = new int[n];

        for (int i = 0; i < n; i++)
            seats[i] = sc.nextInt();

        int booked = 0, available = 0;
        int max = 0, curr = 0, start = -1, end = -1, temp = 0;

        for (int i = 0; i < n; i++) {
            if (seats[i] == 1)
                booked++;
            else
                available++;

            if (seats[i] == 0) {
                if (curr == 0) temp = i;
                curr++;

                if (curr > max) {
                    max = curr;
                    start = temp;
                    end = i;
                }
            } else {
                curr = 0;
            }
        }

        System.out.println("Booked Seats: " + booked);
        System.out.println("Available Seats: " + available);

        if (max > 0)
            System.out.println("Longest Block: " + start + " to " + end);

        System.out.println(max >= 5
                ? "Group of 5 can sit together"
                : "Group of 5 cannot sit together");

        sc.close();
    }
}