package strings;
import java.util.Scanner;
public class Q4 {
    public static void main(String[]args){
        // total no of digits without loops
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n  = sc.nextInt();
        // String s = n +"";
        String s = Integer.toString(n);
        // String s = Long.toString(n);
        System.out.println(s.length());
        sc.close();
    }
}
