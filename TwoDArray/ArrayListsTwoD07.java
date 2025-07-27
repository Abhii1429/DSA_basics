package TwoDArray;
// import java.util.List;
import java.util.*;
public class ArrayListsTwoD07 {
    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);
        b.add(50);
        List<Integer> c = new ArrayList<>();

        List<Integer> d = new ArrayList<>();
        d.add(60);

        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);
        l.add(d);
        
        // for(int i = 0; i < a.size(); i++){
        //     System.out.print(a.get(i) +" ");
        // }

        // for(int i = 0; i < l.size(); i++){
        //     System.out.println(l.get(i));
        // }

        // System.out.println(l.get(1).get(1)); //50

        for(int i = 0; i < l.size(); i++){
            List<Integer> x = l.get(i);
            
            for(int j = 0; j < x.size(); j++){
                System.out.print(x.get(j) +" "); // provides required result
            }
            System.out.println();
        }
    }
}
