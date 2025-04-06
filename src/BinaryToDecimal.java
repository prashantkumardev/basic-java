import java.util.Scanner;
import java.util.logging.Logger;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        try {
            int decimal = binaryToDecimal(binaryString);
            System.out.println("Decimal equivalent: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }

    public static int binaryToDecimal(String binaryString) {
        if (!binaryString.matches("[01]+")) {
            throw new IllegalArgumentException("Input must be a valid binary number (only 0s and 1s)!");
        }
        int decimal = 0;
        int length = binaryString.length();
        for (int i = 0; i < length; i++) {
            char c = binaryString.charAt(i);
            int bit = c - '0';
            int power = length - 1 - i;
            decimal += bit * Math.pow(2, power);
        }
        return decimal;
    }
}