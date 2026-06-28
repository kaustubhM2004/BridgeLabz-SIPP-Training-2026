import java.io.*;

public class BillReader {

    public static void main(String[] args)
    {
      int cnt = 0;

      try
      {
          BufferedReader br =
                  new BufferedReader(
                  new FileReader(
                  "bill.txt"));

          String s;

          while((s=br.readLine())!=null)
          {
              System.out.println(s);

              cnt++;
          }

          br.close();

          System.out.println(
                  "Total Lines = "
                  + cnt);
      }
      catch(FileNotFoundException e)
      {
          System.out.println(
                  "bill.txt not found");
      }
      catch(IOException e)
      {
          System.out.println(
                  "Error reading file");
      }
    }
}