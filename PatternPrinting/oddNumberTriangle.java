package PatternPrinting;
import java.util.Scanner;
public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row m:");
        int m = sc.nextInt();
        System.out.print("Enter column n:");
        int n = sc.nextInt();

        for(int i = 1; i <= m; i++){
            for(int j =1; j <= i; j++){
                System.out.print((2*j-1) +" ");
            }
            System.out.println();
        }

        // //2nd method
        // for(int i = 1; i <= m; i++){
        //     for(int j =1; j <= 2*i-1; j += 2){
        //         System.out.print((j) +" ");
        //     }
        //     System.out.println();
        // }
        sc.close();
    }
}
