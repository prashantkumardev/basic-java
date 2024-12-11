/**
 * Find the largest of N
 */

import java.util.Scanner;

public class LargestOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements (N): ");
        int N = sc.nextInt();
        if (N<=0){
            System.out.print("Please enter a positive integer for N.");
            return;
        }
        System.out.println("Enter the Numbers: ");
        double largest = Double.NEGATIVE_INFINITY;
        for(int i =0; i<N;i++){
            double num = sc.nextInt();
            if (num>largest){
                largest= num;
            }
        }
        System.out.println("The largest of number is "+largest);
        sc.close();
    }
}
