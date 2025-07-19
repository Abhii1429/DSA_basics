package TwoDArray;
import java.util.Scanner;
public class outputUsingNestedLoops01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];// Declaration & Memory allocation
        // arr[0][0] = 9; //initialization

        int m = arr.length; // no of Rows
        int n = arr[0].length; // no of Columns
            // input of 2D array
            System.out.print("enter the elements of 2D array: ");
        for(int i = 0; i < m; i++){ //rows
            for(int j = 0; j < n; j++){ //columns
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        //output of 2D array
        System.out.println("Output: ");
        for(int i = 0; i < m; i++){ //rows
            for(int j = 0; j < n; j++){ //columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
