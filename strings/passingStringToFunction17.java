package strings;

public class passingStringToFunction17 {
   public static void main(String[] args){
    String s = "raghav";
    System.out.println(s);
    change(s);
    System.out.println(s); // raghav
    // String is pass by value  
   } 
   public static void change(String s){
    s = "madhav"; // no change in value of sring even after updation
   }
}
