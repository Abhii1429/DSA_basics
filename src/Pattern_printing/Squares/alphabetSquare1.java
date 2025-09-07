package Pattern_printing.Squares;
import java.util.Scanner;
public class alphabetSquare1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of alphabet:");
        int n = sc.nextInt();

        for(int i=1; i<=n;i++){ //Rows
            for (int j=1; j<=n;j++){ //Columns
                System.out.print((char)(j+96)+" "); //Typecasting & Unicode
            }
            System.out.println();
        }
    }
}
