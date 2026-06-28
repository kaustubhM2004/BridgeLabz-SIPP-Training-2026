import java.io.*;

public class SchoolResult {

    public static void main(String[] args)
    {
      try
      {
          BufferedReader br =
                  new BufferedReader(
                  new FileReader("students.txt"));

          PrintWriter pw =
                  new PrintWriter(
                  new FileWriter(
                  "report.txt",true));

          String s;

          while((s=br.readLine())!=null)
          {
              String p[] = s.split(" ");

              String name = p[0];

              int m1 = Integer.parseInt(p[1]);
                 int m2 = Integer.parseInt(p[2]);
               int m3 = Integer.parseInt(p[3]);

              double avg =
                      (m1+m2+m3)/3.0;

              pw.println(
                      name +
                      " Average = " +
                      avg);
          }

          br.close();
          pw.close();

          System.out.println(
                  "Report generated");
      }
      catch(FileNotFoundException e)
      {
          System.out.println(
                  "Student file not found");
      }
      catch(IOException e)
      {
          System.out.println(
                  "File error");
      }
    }
}