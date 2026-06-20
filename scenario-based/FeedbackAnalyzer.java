import java.io.*;

public class FeedbackAnalyzer {

    public static void main(String[] args)
            throws IOException
    {
      BufferedReader br =
              new BufferedReader(
              new InputStreamReader(
              System.in));

      int cnt = 0;

      for(int i=1;i<=5;i++)
      {
          String s =
                  br.readLine();

          if(s.toLowerCase()
                  .contains("good"))
          {
              cnt++;
          }
      }

      System.out.println(
              "Good Feedback Count = "
              + cnt);
    }
}