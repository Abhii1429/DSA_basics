package Pattern_printing.Triangle;
import java.util.Scanner;
public class noTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        for(int i=1; i<=n;i++){ //Rows
            for (int j=1; j<=i;j++){ //Columns
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
