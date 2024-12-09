import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Factorial for -ve number can't be determined ! \n Try with +ve numbers");
        }else{
            long factorial = 1;
            for (int i=1; i<=n; i++){
                factorial *=i;
            }
            System.out.println("The factorial of the given number " + n + " is: " + factorial);
        }
    }
}