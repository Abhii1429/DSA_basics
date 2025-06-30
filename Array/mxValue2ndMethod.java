package Array;

public class mxValue2ndMethod {
    public static void main(String[] args){
        int[] arr = {-10,-8,-43,-56,-456};
        
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            mx = Math.max(mx, arr[i]);
        }
        System.out.print("Max value is:"+ mx);
    }
}
