package Array;
  class rotateArr{
    public static void reverse(int[] arr, int i, int j){
      while(i <= j){
         int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          i++;
          j--;
        }  
    }
}    
public class rotateArray08 {
   public static void main(String[] args){
    //Rotate array by K steps
    int[] arr = {10,20,30,40,50,60,70};
    int n = arr.length;
    for(int ele : arr){
        System.out.print(ele +" ");
    }
    System.out.println();
    //rotate by k = 4
    int k = 5;
    // int i = 0, j = n-k;
   rotateArr.reverse(arr, 0, n-k-1);
   rotateArr.reverse(arr, n-k, n-1);
   rotateArr.reverse(arr, 0, n-1);
    
    for(int ele : arr){
        System.out.print(ele +" ");
    }
   } 
}
