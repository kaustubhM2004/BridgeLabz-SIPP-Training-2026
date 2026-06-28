import java.util.Scanner;

public class RockPaperScissors {

    static int computerChoice() {
        return (int) (Math.random() * 3) + 1;
    }

    static String findWinner(int user, int computer) {
        if (user == computer)
            return "Draw";

        if ((user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2))
            return "User";

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Rock 2.Paper 3.Scissors");

        int user = sc.nextInt();
        int computer = computerChoice();

        System.out.println("Computer Choice = " + computer);
        System.out.println(findWinner(user, computer));

        sc.close();
    }
}