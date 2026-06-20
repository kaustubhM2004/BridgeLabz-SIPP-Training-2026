public class QuizApp {

    public static void main(String[] args)
    {
        String ans[] = {"A","B","C","D"};

        for(int i=0;i<6;i++)
        {
            try
            {
                if(ans[i].equals("A"))
                    System.out.println("Correct");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Invalid answer index : " + i);
            }
            catch(NullPointerException e)
            {
                System.out.println("Answer missing");
            }
        }
    }
}