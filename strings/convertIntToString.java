package strings;
import java.util.Scanner;
public class convertIntToString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        String s = n + ""; // ("" + n) both gives string only
        System.out.println(s);
        sc.close();
    }
}
