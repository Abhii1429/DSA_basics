package Assignment;

public class productOfElementArr01 {
    public static void main(String[] args){
        // Calculate the product of all the elements in the given array.
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int pro = 1;
        for(int i = 0; i < n; i++){
            pro = pro * arr[i];
        }
        System.out.print("\n"+pro + " ");
    }
}
