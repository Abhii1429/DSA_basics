package Array;

public class reverseArray06 {
    public static void main(String[]args){
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length;
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();

        //reverse
        for(int i = 0; i < n/2; i++){
            // int j = n-1-i;

            //swapping
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

      for(int ele : arr){
          System.out.print(ele +" ");
        }
        System.out.println();
    }
}
