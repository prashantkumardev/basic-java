import java.util.Scanner;

/**
 * Check triangle
 *
 * You are given the lengths of 3 sides of a valid triangle.
 * You need to print any one of the following outputs depending on the triangle's nature.
 * Print 1, if the triangle is equilateral
 * Print 0, if it's isosceles
 * Print -1, if it's scalene
 * Draw a flowchart for this process.
 */
public class Check_Triangle {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the sides of the triangle:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if(a==b && b==c)
            System.out.println("1");
        else if(a==b || b==c || c==a)
            System.out.println("0");
        else
            System.out.println("-1");
    }
}
