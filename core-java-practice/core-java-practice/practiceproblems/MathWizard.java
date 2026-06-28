import java.util.Scanner;
public class MathWizard {
    boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
    int fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return n == 0 ? 0 : b;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    int power(int base, int exp) {
        int result = 1;

        for (int i = 1; i <= exp; i++)
            result *= base;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathWizard mathWizard = new MathWizard();
       System.out.println("1.Prime\n2.Factorial\n3.Fibonacci\n4.GCD\n5.LCM\n6.Power");
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
                int n1 = sc.nextInt();
                System.out.println(mathWizard.isPrime(n1));
                break;
            case 2:
            int n2 = sc.nextInt();
                System.out.println(mathWizard.factorial(n2));
                break;
         case 3:
                int n3 = sc.nextInt();
                System.out.println(mathWizard.fibonacci(n3));
                break;
        case 4:
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();
                System.out.println(mathWizard.gcd(a1, b1));
                break;
            case 5:
                int a2 = sc.nextInt();
                int b2 = sc.nextInt();
                System.out.println(mathWizard.lcm(a2, b2));
                break;
            case 6:
                int base = sc.nextInt();
                int exp = sc.nextInt();
                System.out.println(mathWizard.power(base, exp));
                break;
            default:
                System.out.println("Invalid Choice");
        }}}