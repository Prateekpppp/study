public class Java_variables {
    public static void main(String[] args) {
        System.out.println("""
        A data type tells Java what kind of value a variable can store.
        
        Types: Primitive and Non-primitive (reference) data types

        Primitive: byte(8 bits),short(16 bits),int(32 bits),long(64 bits),float(32 bits),double(64 bits),char(16 bits),boolean(1 bit)

        float price = 99.5f;

        long population = 9000000L;

        Non-Primitive: String, Arrays, Classes, Interfaces

        Steps:
        Declaration, Initialization

        Java is a strongly typed language, meaning it checks whether the assigned value is compatible with the variable's declared type.
        
        """);
        
        String name = "Rahul";
        int age = 20;
        double salary = 25000.50;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}