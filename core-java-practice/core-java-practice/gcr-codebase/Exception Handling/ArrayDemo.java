public class ArrayDemo {

    public static void main(String[] args)
    {
      int arr[] = {10,20,30};

      int idx = 5;

      try
      {
          System.out.println(
                  "Value at index "
                  + idx + ": " + arr[idx]);
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
          System.out.println("Invalid index!");
      }
      catch(NullPointerException e)
      {
          System.out.println("Array is not initialized!");
      }
    }
}