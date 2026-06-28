// public class Demo1 {
//     {
//     System.out.println("Hii non static block");
    
// }



// public class Demo1{
//     public Demo1(){

//         System.out.println("hi i am constructor");
//     }
// }

// public static void main(String[] args){
//     Demo1 new Demo();
//     System.out.println("hi i am main method");
// }}
public class Demo1 {
    {
        System.out.println("Hi, I am non-static block");
    }

   
    public Demo1() {
        System.out.println("Hi, I am constructor");
    }


    static{
        System.out.println("hi i am static block");
    }



    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        System.out.println("Hi, I am main method");
    }
}