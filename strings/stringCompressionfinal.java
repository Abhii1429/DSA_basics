package strings;

public class stringCompressionfinal {
   public static void main(String[] args) {
     String s = "aaaaggeeeccuuuudeh";
     char[] arr = s.toCharArray();
     String ans = "";
     // 2 pointer approach
     int i = 0, j = 0;

     while(j < arr.length){
        if(arr[i] == arr[j]) j++;
        else{
            ans += arr[i];
            int len = j-i;
            if(len > 1) ans += len;
            i = j;
        }
     }
     ans += arr[i];
     int len = j-1;
     if(len > 1) ans += len;
     System.out.println(ans);
   }
}
