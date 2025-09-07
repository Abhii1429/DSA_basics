package Pattern_printing.Squares;
import java.util.Scanner;
public class starSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side of Square:");
        int m = sc.nextInt();
       for(int i=1; i<=m;i++){
           for (int j=1; j<=m;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
