package strings;

public class maxValueQ11 {
    public static void main(String[] args){
        // String s = "10245";
        // int n = Integer.parseInt(s);
        // System.out.println(n);

        // String[] arr = {"455", "74563", "56354", "8025"};
        // // int mx = Integer.MIN_VALUE; // for biggest number
        // int mx = Integer.parseInt(arr[0]);
        // for(int i = 1; i < arr.length; i++){ // i = 0 when Min_Value is used
        //     int n = Integer.parseInt(arr[i]);
        //     mx = Math.max(mx, n);
        // }
        // System.out.println("Max value:"+ mx);

        String[] arr = {"9722000578984987", "7485957","4556785", "00258"};
        String maxStr = arr[0];
        for(int i = 1; i < arr.length; i++){ // i = 1 becoz we are starting from 0 idx already
            maxStr = max(maxStr, arr[i]);
        }
        System.out.println(maxStr);
    }
    // finding largest number without changing string into number
    public static String max(String a, String b){ // return type=> String
        String s = purify(a), t = purify(b);   
        if(s.length() > t.length()) return a;
        if(s.length() < t.length()) return b;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                if(s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length() >= b.length()) return a;
        else return b;
    }

    public static String purify(String s){ // removing the leading zeroes
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0') return s.substring(i);
        }
        return s;
    }
}
