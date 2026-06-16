import java.util.*;

public class SecretMessageValidator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int v = 0, c = 0, d = 0, s = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if(Character.isLetter(ch)) {
                if("aeiou".indexOf(ch) != -1)
                    v++;
                else
                    c++;
            }
            else if(Character.isDigit(ch))
                d++;
            else
                s++;
        }

        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
        System.out.println("Digits = " + d);
        System.out.println("Special Characters = " + s);

        if(str.length() >= 8 && d >= 2 && s >= 1)
            System.out.println("Strong");
        else
            System.out.println("Weak");
    }
}