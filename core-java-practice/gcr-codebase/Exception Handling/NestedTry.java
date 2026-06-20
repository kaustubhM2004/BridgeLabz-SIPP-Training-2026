public class NestedTry {

    public static void main(String[] args)
    {
      int arr[] = {10,20,30};

      int idx = 2;
      int d = 0;

      try
      {
          try
          {
              int x = arr[idx];

              System.out.println(x/d);
          }
          catch(ArithmeticException e)
          {
              System.out.println(
                      "Cannot divide by zero!");
          }
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println(
                  "Invalid array index!");
      }
    }
}