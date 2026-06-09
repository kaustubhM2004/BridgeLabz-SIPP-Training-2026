class Ravi {
    String name;
    int age;
    String rank;
    double salary;
    float fees;

    public Ravi(String name, int age, String rank, double salary, float fees) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.salary = salary;
        this.fees = fees;
    }

    public static void main(String[] args) {
        // Initializing the object strictly with positional arguments.
       Ravi r = new Ravi("Sahil", 18, "intermediate", 180000.00, 12345f);
        
        // Diagnostic output to verify success.
        System.out.println("Object successfully initialized for: " + r.name);
    }
}