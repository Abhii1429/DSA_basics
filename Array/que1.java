package Array;

public class que1 {
    public static void main(String[] args){
        int[] arr ={81,17,45,36,100,32,60};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] < 35){
                System.out.print(i+ " ");
            }
        }
    }
}
