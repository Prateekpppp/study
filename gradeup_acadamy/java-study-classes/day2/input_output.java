import java.util.Scanner;

public class input_output{
    public static void main(String[] args) {
        System.out.println("""
        Scanner is a Java utility class that can read input from sources such as the keyboard.
       
        import java.util.Scanner;

        Creating a Scanner object: Scanner sc = new Scanner(System.in);

        nextInt()	Integer
        nextDouble()	Double
        nextFloat()	Float
        nextBoolean()	Boolean
        next()	One word
        nextLine()	Entire line of text

        
        """);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = sc.nextInt();

        System.out.println("Your age is: " + age);

        sc.close();
    }
}