package Pattern_printing.Special_pattern;
import java.util.Scanner;
public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n(Odd no) :");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) { //rows
            for (int j =1; j <= n ; j++) { //columns
                if (i == j || i+j == n+1) {
                    System.out.print("* ");
                }else System.out.print(" "+ " "); //empty spaces is being printed
            }
            System.out.println();
        }
    }
}
