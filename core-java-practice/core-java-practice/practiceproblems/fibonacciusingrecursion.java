import java.util.*;
class FibonacciUsingRecursion {
    public int fibonacciusingrecursion(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciusingrecursion(n - 1) + fibonacciusingrecursion(n - 2);
    }

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
FibonacciUsingRecursion obj = new FibonacciUsingRecursion();
System.out.println("Fibonacci number is: " + obj.fibonacciusingrecursion(n));
    }
}