class Demo {
    public int productOf(int n) {
        if (n == 0 || n == 1) {   
            return 1;
        }
        return n * productOf(n - 1);
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        int prod = d.productOf(3);
        System.out.println(prod);
    }
}