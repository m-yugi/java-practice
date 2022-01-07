import java.util.*;

public class split {
    public static boolean cheppu(String pat,String s){
        List<String> ar= new ArrayList<>();
        HashMap<Character,String> hm= new HashMap<>();                                      /*String pat="abba";
                                                                                            String s="dog cat cat dog";*/
        ar=  Arrays.asList(s.split(" "));
        for(int i=0;i<ar.size();i++){
            if(!hm.containsKey(pat.charAt(i))){
                hm.put(pat.charAt(i),ar.get(i));
            }

            else {
                if (!Objects.equals(hm.get(pat.charAt(i)), ar.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pat="aaaa";
        String s="dog cat cat dog";
        System.out.println(cheppu(pat,s));
    }
}
