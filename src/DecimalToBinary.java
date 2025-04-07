import java.util.Scanner;


public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        try {
            int decimalNumber = scanner.nextInt();
            if (decimalNumber < 0) {
                throw new IllegalArgumentException("Input must be a non-negative integer");
            }
            String binary = decimalToBinary(decimalNumber);
            System.out.println("Binary equivalent: " + binary);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
    private static String decimalToBinary(int decimalNumber) {
        if(decimalNumber==0){
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);  // Prepend the remainder
            decimalNumber = decimalNumber / 2;
        }

        return binary.toString();
    }
}
