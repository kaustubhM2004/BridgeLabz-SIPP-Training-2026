import java.io.*;
import java.util.*;

public class StudentData {

    String ID;
    String Name;
    int Marks;

    public StudentData() {
    }

    public StudentData(String ID, String Name, int Marks) {
        this.ID = ID;
        this.Name = Name;
        this.Marks = Marks;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Marks=" + Marks +
                '}';
    }

    public void addStudentData() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your ID: ");
            ID = sc.next();

            System.out.print("Enter your Name: ");
            Name = sc.next();

            System.out.print("Enter your Marks: ");
            Marks = sc.nextInt();

            // Append Mode
            FileWriter writer = new FileWriter("Student.txt", true);

            writer.write(
                    "ID: " + ID +
                    ", Name: " + Name +
                    ", Marks: " + Marks +
                    "\n"
            );

            writer.close();

            System.out.println("Student Added Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayStudentData() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));

            String line;

            System.out.println("\nStudent Records:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        StudentData data = new StudentData();

        data.addStudentData();      // Add record
        data.displayStudentData();  // Display all records
    }
}