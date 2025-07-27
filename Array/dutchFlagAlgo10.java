package Array;

public class dutchFlagAlgo10 {
    public static void main(String[] args){
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        // // Method-1:Two pass approach
        // int noOfZeroes = 0, noOfOnes = 0;
        //  for(int i = 0; i < n; i++){
        //     if(arr[i] == 0) noOfZeroes++;
        //     if(arr[i] == 1) noOfOnes++;            
        // }
        // // my approach
        // //  for(int i = 0; i < noOfZeroes; i++){
        // //     arr[i] = 0;
        // // }
        // // for (int i = noOfZeroes; i < noOfOnes; i++) {
        // //     arr[i] = 1;
        // // }
        // // for (int i = noOfOnes; i < n; i++) {
        // //     arr[i] = 2;
        // // }

        // // sir's approach
        // for (int i = 0; i < n; i++) {
        //     if(i < noOfZeroes) arr[i] = 0;
        //     else if(i < noOfZeroes + noOfOnes) arr[i] = 1;
        //     else arr[i] = 2;
        // }
        // for(int ele : arr){
        //     System.out.print(ele +" ");
        // }
        // System.out.println();  
        
        // Method-3: Two pass approach(3-pointer approach)
        int mid = 0, high = n-1, low = 0;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
 
