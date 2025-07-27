package TwoDArray;
import java.util.Scanner;
public class Que01 {
    public static void main(String[]args){
        //store Roll No & Marks
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];
        System.out.println("Input elements: ");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(("Output"));
         for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
         }
         sc.close();
    }
}
