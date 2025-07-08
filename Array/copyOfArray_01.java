package Array;
import java.util.Arrays;
public class copyOfArray_01 {
    public static void main(String[] args){
        int[] arr = {30,10,40,23,89,34};
         for (int ele : arr) { //for each loop
            System.out.print(ele + " ");
        }
        System.out.println();

        // int[] nums = arr;//Shallow copy
        // nums[0] = 70;
        // System.out.print(arr[0]);
        // //this copies only reference that's why change is reflected in both

        // Deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 70;
        // System.out.println(arr[0]);
        System.out.println(brr[0]);

        //2nd method of deep copy
        int [] crr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            crr[i] = arr[i];
        }
        crr[0] = 90;
        System.out.print(crr[0]);
    }
}
