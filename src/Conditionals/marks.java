package Conditionals;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int m = sc.nextInt();

        if (m >= 80) System.out.println("Very good");
        else if ( m >= 60) System.out.println("Good");
       else if (m > 40) System.out.println("Average");
        else  System.out.println("Fail"); //(m < 40)
         sc.close();
    }
}
