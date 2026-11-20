public class binary_to_decimal{
    public static void main(String[] args) {
        String binary = "11111111111111111111111111111011";
        int digit;
        for(int i = 0; binary == 0; i = binary%10){

            binary = binary/10;

            System.out.println(i+"-------"+binary);

        }
    }
}