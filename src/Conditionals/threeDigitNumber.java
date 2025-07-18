package Conditionals;
import java.util.Scanner;
public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();
        //To write two condition simultaneously we use the concept of Logical operator
        if(n>99 && n<1000)
            System.out.println("It's a 3 digit number.");
        else
            System.out.println("Not a 3 digit number.");
             sc.close();
    }
}
