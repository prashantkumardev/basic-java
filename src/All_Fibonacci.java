import java.util.Scanner;

/**
 * All fibonacci numbers
 *
 * You are given a single non-negative integer, N. You need to print all numbers that:
 * (i) occur in the range 0 to N (both inclusive)
 * (ii) are a part of the fibonacci sequence
 * Draw a flowchart for this process
 * Note 1: The first two terms of the fibonacci sequence are 0 and 1.
 * Note 2: You don't need to submit the problem. Just attempt in your notebook and ask doubts if you need help.
 */
public class All_Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the number till where you want to find the Fibonacci:");
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int a = 0, b = 1;

        while (a <= N) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
//5--> 0,1,1,2,3,5
//10--> 0,1,1,2,3,5,8
//15--> 0,1,1,2,3,5,8,13
