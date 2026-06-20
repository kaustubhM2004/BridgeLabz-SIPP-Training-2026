import java.util.*;

public class Subsets {

    static void sub(int arr[],int i,List<Integer> cur)
    {
      if(i==arr.length)
      {
         System.out.println(cur);
         return;
      }

        sub(arr,i+1,cur);

      cur.add(arr[i]);

        sub(arr,i+1,cur);

      cur.remove(cur.size()-1);
    }

    public static void main(String[] args)
    {
      int arr[] = {1,2};

       sub(arr,0,new ArrayList<>());
    }
}