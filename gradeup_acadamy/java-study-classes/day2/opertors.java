public class opertors {

    public static void main(String[] args) {
        System.out.println("""

            Arithmetic operators: +, -, *, /, %
            These perform mathematical calculations.


            Assignment operators: =, +=, -=, *=, /=
            These assign or update variable values.


            Relational operators:
            ==	Equal to
            !=	Not equal to
            >	Greater than
            <	Less than
            >=	Greater than or equal to
            <=	Less than or equal to


            Logical operators:
            &&	Logical AND
            ||	Logical OR
            !	Logical NOT


            Increment and decrement operators:
            ++	Increment by 1	a++ a = a + 1;
            --	Decrement by 1	a-- a = a - 1;
            Post-increment (a++)
            Pre-increment (++a)


            Ternary operator (? :)
            condition ? valueIfTrue : valueIfFalse;


            Bitwise operators:
            Computers store integer values in binary form (0s and 1s).
            5	0101
            3	0011
            6	0110
            Bitwise operators perform operations directly on these binary bits.

            int a = 5; => (0101)
            int b = 3; => (0011)
                Bitwise AND (&):
                System.out.println(a & b);
                      0101  (5)
                    & 0011  (3)
                    ------
                    0001  (1)

                Bitwise OR (|):
                System.out.println(a | b);
                      0101  (5)
                    | 0011  (3)
                    ------
                    0111  (7)

                Bitwise XOR (^):
                      0101 (5)
                    ^ 0011 (3)
                    ------
                    0110  (6)

                Bitwise NOT (~):
                It reverses every bit:
                - 0 becomes 1.
                - 1 becomes 0.
                int a = 5; => 
                step 1:
                    00000000 00000000 00000000 00000101 (5)
                step 2:
                    "Flip every single bit (0 becomes 1, and 1 becomes 0)"
                    11111111 11111111 11111111 11111010
                    "a leading 1 means the number is negative."
                step 3:
                    "Subtract 1 from the binary sequence"
                    11111111 11111111 11111111 11111001
                    00000000 00000000 00000000 00000110 (6)
                    Attach the negative sign because the sign bit from Step 2 was 1: -6
                System.out.println(~a); => -6
                ~x = -(x + 1)

                Left shift (<<):
                5 << 1
                1 0 1 (5)
                1 0 1 _
                1 0 1 0 (10)

                5 << 2
                1 0 1 (5)
                1 0 1 _ _
                1 0 1 0 0 (20)

                expression:
                x << n = x * 2^n

                
                Right shift (>>):
                5 >> 1
                1 0 1 (5)
                1 0 1 _
                1 0 1 0 (10)

                5 << 2
                1 0 1 (5)
                1 
                0 0 1 (1)

                expression:
                x >> n = x / 2^n

                Unsigned right shift (>>>):
                expression:
                x >>> n = x / 2^n for positive
                x >>> n = (x+2^32) / 2n for negative


        
        """);
    }
}