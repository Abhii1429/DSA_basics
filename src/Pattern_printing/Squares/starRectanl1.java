package Pattern_printing.Squares;
import java.util.Scanner;
public class starRectanl1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of Rows:");
        int m = sc.nextInt();
        System.out.print("Enter no. of Columns:");
        int n = sc.nextInt();
      //code for patterns-
        for (int i=1; i<=m; i++){
            for(int j =1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
