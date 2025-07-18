package PatternPrinting;
import java.util.*;
public class flappedAlphabetTriangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row m :");
        int m = sc.nextInt();
        System.out.print("Enter row n :");
        int n = sc.nextInt();

        for(int i = 1; i <= m; i++){
            for(int j =1; j <= n+1-i; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
