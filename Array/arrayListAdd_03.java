package Array;
import java.util.ArrayList;
public class arrayListAdd_03 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list +" "+ list.size());
        list.add(68);
        System.out.println(list+" "+list.size());
        list.add(28);
        System.out.println(list+" "+list.size());
        list.add(284);
        System.out.println(list+" "+list.size());
        list.add(-45);
        System.out.println(list+" "+list.size());
        
        list.remove(1);
        System.out.println(list+" "+list.size());
    }
}
