import java.util.Arrays;

public class array{
    static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {

        // 1. Creating an array and Initializing array elements
        int[] marks = {80, 90, 75, 95};

        int[] numbers = new int[3];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // 2. Important: Does Java pass arrays by reference?
        // Java is always pass-by-value.
        // printNumbers(marks);

        // Two-dimensional arrays
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int[][] data = {
            {10, 20},
            {30, 40, 50},
            {60}
        };

        System.out.println(Arrays.toString(numbers));
    }
}