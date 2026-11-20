public class control_statements {
    public static void main(String[] args) {
        int age = 20;

        // if (age) { .\control_statements.java:5: error: incompatible types: int cannot be converted to boolean
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
    }
}