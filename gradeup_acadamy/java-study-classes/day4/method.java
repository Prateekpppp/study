public class Method {
    static void greet() {
        System.out.println("""
            1. What is a method?
                Imagine you have to perform the same calculation 100 times.

                Instead of writing the same code 100 times, you can write it once and reuse it.

                That reusable block of code is called a method.
        """);
    }

    static void greet1(String name) {

        System.out.println("Hello " + name);

    }

    static int add(int a, int b) {

        int result = a + b;

        return result;    

}

    public static void main(String[] args) {

        // greet();

        // greet1("John");

        System.out.println(add(3,4));

    }

    // Method overloading
    // Method overloading means creating multiple methods with the same name but different parameter lists.
    // Java decides which method to execute based on the arguments.

    // static int add(int a, int b) {
    //     return a + b;
    // }

    // static int add(int a, int b, int c) {
    //     return a + b + c;
    // }

    // static double add(double a, double b) {
    //     return a + b;
    // }

    // public static void main(String[] args) {

    //     System.out.println(add(10, 20));

    //     System.out.println(add(10, 20, 30));

    //     System.out.println(add(10.5, 20.5));
    // }
}