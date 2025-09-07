package Pattern_printing.Triangle;
import java.util.Scanner;
public class alphaFlipTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();

        for(int i=1; i<=n;i++){ //Rows
            for (int j=1; j <= ( n+1-i) ;j++){ //Columns
                System.out.print((char)(i+64)+ " "); /*this loop will run for (n+1-i) times
               having value [(char)(i+64)] */
            }
            System.out.println();
        }
    }
}
