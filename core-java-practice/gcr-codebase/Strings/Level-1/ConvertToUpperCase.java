import java.util.Scanner;

public class ConvertToUpperCase {

    static String convertUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                result += (char)(ch - 32);
            else
                result += ch;
        }

        return result;
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String userUpper = convertUpper(text);
        String builtInUpper = text.toUpperCase();

        System.out.println(userUpper);
        System.out.println(builtInUpper);
        System.out.println(compareStrings(userUpper, builtInUpper));

        sc.close();
    }
}