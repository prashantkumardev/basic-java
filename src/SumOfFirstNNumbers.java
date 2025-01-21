import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int sum = 0;
        int i =1;
        while (i<=n){
            sum += i;
            i+=1;
        }
        System.out.print("Sum of First N Numbers is: "+sum);
    }
}
