import java.util.ArrayList;
import java.util.Arrays;
public class shuffle_check {
    public static void main(String[] args) {
        ArrayList<String> s= new ArrayList<>();
        String s1="xyz";
        String s2="12";
        s.add("1xyz2");
        s.add("12xyz");
        s.add("xyz12");
        s.add("xyz");
        s.add("hello");
        for(String i:s){
            System.out.println(check(s1,s2,i));
        }
    }
    public static boolean check(String s1,String s2,String res){
      if(s1.length()+s2.length()!=res.length()) return false;
      char[] temp1= s1.toCharArray();
      char[] temp2= s2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        int i=0,j=0,k=0;
        while(k<res.length()){
            if(i<temp1.length && temp1[i]==res.charAt(k)) i++;
            else if(j<temp2.length && temp2[j]==res.charAt(k)) j++;
            else return false;
            k++;
        }
        return true;
    }
}
