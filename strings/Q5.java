package strings;

public class Q5 {
    public static void main(String[] args){
        // Que-> input and update position in string
        String s = "Abhishek";
        String str ="";
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0) str += 'a';
            else str += s.charAt(i);
        }
        s = str;
        System.out.println(s);
        //Performance of strings -> Poor performance because of immutability
    }   
}
