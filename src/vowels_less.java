import java.util.HashMap;
import java.util.HashSet;

public class vowels_less {
    public static void main(String[] args) {
        String s="cauliflower";
        StringBuilder sc= new StringBuilder();
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('a',0);
        hm.put('e',0);
        hm.put('i',0);
        hm.put('o',0);
        hm.put('u',0);
        for (char j:s.toCharArray()){
        if(hm.containsKey(j)){
            if(hm.get(j)>0){
//                return
            }
        }
        }
    }
}
