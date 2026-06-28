public class LibrarySystem {

    static String books[] =
            {"Java","Python",null,"C++"};

    static int getBookLength(int idx)
    {
        try
        {
            return books[idx].length();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Book index not found");
        }
        catch(NullPointerException e)
        {
            System.out.println("Book entry is null");
        }

        return -1;
    }

    public static void main(String[] args)
    {
        System.out.println(getBookLength(10));

        System.out.println(getBookLength(2));
    }
}