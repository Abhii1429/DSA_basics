package Loops;
import java.util.Scanner;
public class AP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of terms 'n' of AP : ");
        int n = sc.nextInt();
//      Method-1:
//        for (int i =4; i<= 3*n+1; i+=3){
//            System.out.println(i);
//        Method-2:
        int a =4, d = 3;
        for (int i =1; i<=n; i++){
            System.out.println(a);
            a += d;

        }
    }
}
