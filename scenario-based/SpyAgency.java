// A spy agency encodes messages. Reverse a secret message, check if
// it is a palindrome, count vowels/consonants, and verify if two
// intercepts are anagrams. Extend: find the first non-repeating
// character in a surveillance log.
import java.util.*;

public class SpyAgency {

    static String reverseMessage(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(reverseMessage(s));
    }

    static void countVC(String s) {
        int v = 0, c = 0;

        for(char ch : s.toLowerCase().toCharArray()) {
            if(Character.isLetter(ch)) {
                if("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }

        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
    }

    static boolean areAnagrams(String a, String b) {
        char x[] = a.toLowerCase().toCharArray();
        char y[] = b.toLowerCase().toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }

    static char firstNonRepeating(String s) {
        for(char ch : s.toCharArray())
            if(s.indexOf(ch) == s.lastIndexOf(ch))
                return ch;

        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret message: ");
        String msg = sc.nextLine();

        System.out.println("Reversed: " + reverseMessage(msg));
        System.out.println(isPalindrome(msg) ? "Palindrome" : "Not Palindrome");

        countVC(msg);

        System.out.print("Enter first intercept: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second intercept: ");
        String s2 = sc.nextLine();

        System.out.println(areAnagrams(s1, s2) ?
                "Anagrams" : "Not Anagrams");

        System.out.print("Enter surveillance log: ");
        String log = sc.nextLine();

        char ch = firstNonRepeating(log);

        System.out.println(ch == '\0' ?
                "No non-repeating character" :
                "First non-repeating character: " + ch);

        sc.close();
    }
}