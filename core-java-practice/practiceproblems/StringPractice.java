import java.util.*;
// public class StringPractice {
//     public static void main(String[] args){
//         // String str1 = "Sachin";
//         // String str2 = "Sachin";
//         String str1 = new String("Sachin");
//         String str2 = new String("Sachin");
//         // if(str1==str2){
//         //     System.out.println("true.");
//         // }
//         // else{
//         //     System.out.print("False");
//         // }
//         if(str1.equals(str2)){
//             System.out.println("True.");
//         }
//         else{
//             System.out.print("False");
//         }
//     }
//}
// import java.util.Scanner;

// public class StringPractice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a sentence: ");
//         String str = sc.nextLine();

//         String[] arr = str.split(" ");

//         System.out.print("Enter the index of the word to reverse (0 to " + (arr.length - 1) + "): ");
//         int index = sc.nextInt();

//         String reversed = "";

//         for (int i = arr[index].length() - 1; i >= 0; i--) {
//             reversed += arr[index].charAt(i);
//         }

//         arr[index] = reversed;

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.*;

public class StringPractice {
    public static void main(String[] args) {

        String str = "aabbcc";

        int[] ch = new int[26];

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            ch[c - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(ch[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + ch[i]);
            }
        }
    }
}