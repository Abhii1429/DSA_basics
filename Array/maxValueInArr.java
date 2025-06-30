package Array;
import java.util.*;
public class maxValueInArr {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the size of array: ");
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // System.out.print("Enter the array elements :");
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        //method-1
        int[] arr = {18,8,43,12,5,56,32};

        int mx = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > mx) mx = arr[i];
        }
        System.out.print("The maximum value is :" + mx);
 
        sc.close();
    }
}
