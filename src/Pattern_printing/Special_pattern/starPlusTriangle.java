package Pattern_printing.Special_pattern;
import java.util.Scanner;
public class starPlusTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        int mid = (n/2)+1;

        for (int i = 1; i <= n ; i++) { //rows
            for (int j =1; j <= n ; j++) { //columns
                if (i == mid || j == mid) {
                    System.out.print("* ");
                }else System.out.print(" "+ " "); //empty spaces is being printed
            }
            System.out.println();
        }
    }
}
