package Conditionals;
import java.util.Scanner;
public class greatestOfThreeNestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number :");
        int c = sc.nextInt();

        if (a > b) {
            if(a>c) System.out.println(a+ " is the largest");
            else System.out.println(c+" is the largest"); //(c>=a>b) as it is already declared that a>b,hence c is the largest.
        } else { // else will include (b>=a) condition, this condition{(b>=a)} will be true as a>b isn't true.
            if(b>c) System.out.println(b+ " is the largest");
            else System.out.println(c+ " is the largest"); //else implies (c>=b>=a)
             sc.close();
        }
    }
}
