import java.util.Scanner;

/**
 * All primes
 *
 * You are given a single positive integer, N.
 * You need to print all prime numbers that occur in the range 1 to N (both inclusive).
 * Draw a flowchart for this process
 */
public class All_Prime {
    public static void main(String[] args) {
        System.out.print("Enter the number till when you want to find the prime(N): ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print("All prime numbers that occur in the range 1 to N are: ");
        if (N<2){
            System.out.println("Numbers less than 2 are not prime");
        }else {
            for (int i = 2; i <= N; i++) {
                boolean isPrime = true;
                // Check divisors for the current number i
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break; // Exit inner loop if a divisor is found
                    }
                }
                // If no divisors were found, it's a prime number
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
