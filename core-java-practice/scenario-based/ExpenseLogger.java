import java.io.*;
import java.util.*;

public class ExpenseLogger {

    public static void main(String[] args)
    {
      Scanner sc =
              new Scanner(System.in);

      try
      {
          System.out.print(
                  "Category : ");

          String cat =
                  sc.nextLine();

          System.out.print(
                  "Amount : ");

          int amt =
                  sc.nextInt();

          FileWriter fw =
                  new FileWriter(
                  "expenses.txt",
                  true);

          fw.write(
                  cat +
                  " - " +
                  amt +
                  "\n");

          fw.close();

          System.out.println(
                  "Expense saved");
      }
      catch(IOException e)
      {
          System.out.println(
                  "File error");
      }
    }
}