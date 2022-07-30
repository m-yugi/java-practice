import java.util.HashMap;
import java.util.Map;
public class merger {
    public static void main(String[] args) {
        HashMap<Character,Integer> res= new HashMap<>();
        res.put('a',1);
        res.put('b',2);
        res.put('c',3);
        res.merge('b',2,Integer::sum);
        for(char i: res.keySet()){
            System.out.println(i+" "+res.get(i));
        }
    }
}
