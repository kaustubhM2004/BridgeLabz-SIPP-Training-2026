package gcr_codebase.Address Book;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AddressBookData {
    
    static ArrayList<Contacts> contact=new ArrayList<>();
    static HashMap<String ,Contacts> contactMap=new HashMap<>();
    static HashSet<String> phoneNumber =new HashSet<>();


    public void add_contact(String name,String number,String email){
        if(phoneNumber.contains(number)){
            System.out.println("USER ALREDY EXIST!!!!");
            return;

        }
        Contacts user=new Contacts(name, number, email);
        contact.add(user);
        contactMap.put(name,user);
        phoneNumber.add(number);
        System.out.println("!!!!CONTACT ADDED SUCCESSFULLY!!!");

        

    }
}