package PatternPrinting;
import java.util.Scanner;
public class mixTriangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row m:");
        int m = sc.nextInt();
        System.out.print("Enter column n:");
        int n = sc.nextInt();

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++){
                if(i%2 == 0){
                     System.out.print((char)(j+64) + " ");
                }else System.out.print(j + " ");
            }
            System.out.println();
        }
         sc.close();
    }
}
