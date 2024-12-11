import java.util.Scanner;

/**
 * Member of Fibonacci
 *
 * You are given a single non-negative integer, N.
 * You need to find out whether N is a part of the fibonacci sequence.
 * Print "Yes" if it is and "No" if it's not.
 * Draw a flowchart for this process
 * Note 1: The first two terms of the fibonacci sequence are 0 and 1.
 */

public class MemberOfFibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the number till where you want to find the Fibonacci:");
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int a = 0, b = 1;
        boolean isFibonacci = false;
        while (a <= N) {
            if (a==N){
                isFibonacci = true;
            }
//            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        if (isFibonacci){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
