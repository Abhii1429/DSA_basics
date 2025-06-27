package PatternPrinting;
import java.util.Scanner;
public class numberRectangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of Rect:");
        int l = sc.nextInt();
        System.out.print("Enter breadth of rect: ");
        int b = sc.nextInt();

        for(int i = 1; i <= l; i++){
            for(int j = 1; j <= b; j++){
                System.out.print((char)(j+64) + " ");//number-->alphabet
            }
            System.out.println();
        }
    }
}

// Star-->Number-->Alphabet