package Array;

public class que4 {
    public static void main(String[]args){
        int[] arr = {81,17,45,36,100,60};

        // int sum = 0;
        // for(int i = 0; i < arr.length; i++){
        //  sum = sum + arr[i];
        // }
        // System.out.print("Sum of all elements:"+ sum);

        int sum = 1;
         for(int i = 0; i < arr.length; i++){
            sum = sum*arr[i];
         }
         System.out.print("Product of elements of arr:"+ sum);
    }
}
