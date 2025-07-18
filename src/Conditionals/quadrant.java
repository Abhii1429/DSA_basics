package Conditionals;
import java.util.Scanner;
public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X coordinate of the point : ");
        int x = sc.nextInt();
        System.out.print("Enter Y coordinate of the point : ");
        int y = sc.nextInt();

        if(x > 0 && y > 0) System.out.println("Point lies in 1 quadrant.");
       else if(x < 0 && y > 0) System.out.println("Point lies in 2 quadrant.");
       else if(x < 0 && y < 0) System.out.println("Point lies in 3 quadrant");
        else if(x > 0 && y < 0) System.out.println("Point lies in 4 quadrant.");
        else if(x == 0 && y >0 || y < 0) System.out.println("Point lies on Y axis");
        else System.out.println("Point lies on Y axis");
         sc.close();
    }
}
