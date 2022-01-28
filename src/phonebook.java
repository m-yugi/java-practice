import java.util.LinkedList;
import java.util.List;

class helper3{
    public List<String> solu(String digits){
            LinkedList<String> ans = new LinkedList<String>();
            if(digits.isEmpty()) return ans;
            String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            ans.add("");
            while(ans.peek().length()!=digits.length()){
                String remove=ans.remove();
                String map=mapping[digits.charAt(remove.length())-'0'];
                for(char c:map.toCharArray()){
                    ans.add(remove+c);
                }
            }
            return ans;
    }
}
public class phonebook {
    public static void main(String[] args) {
        helper3 a= new helper3();
        List<String> res=a.solu("23");
        for(String i:res){
            System.out.println(i);
        }
    }
}
