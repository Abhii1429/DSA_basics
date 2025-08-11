package strings;
import java.util.Scanner;
public class setCharAt12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string :");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1, 'g'); // set character at 1st index to 'g'
        System.out.println(sb);
        sc.close();
    }
}
