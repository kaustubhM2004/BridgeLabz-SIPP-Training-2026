

public class FileExample {
    int id;
    public FileExample (int id){
        this.id=id;


    }
    @Override
    public String toString(){
        // return "ID"+ id;
        System.out.print("ID"+ id);
    }
    public static void main(String[]args){
        FileExample file = new FileExample(10);
        System.out.print(file);

    }
    
}
