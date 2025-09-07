package Loops;
public class tableOf19 {
    public static void main(String[] args) {
        System.out.println("Table of 19: ");
//    1st method:(a)-
//    for (int i = 1; i<=10; i++){
//            System.out.println(19*i);
//
//    1st method:(b)- 177 rounds
//    for (int i = 19; i<=190; i++){
//            if(i%19 == 0)
//                System.out.println(i);
//        Also i++ = i+=1 or i= i+1
//
//        2nd Method: (Better code)- 10 rounds

        for (int i = 19; i<=190; i+= 19){
                System.out.println(i);
        }
    }
}
