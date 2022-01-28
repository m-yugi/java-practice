import java.util.LinkedList;
import java.util.List;

class helper5{
    public List<String> solu(int n){
        List<String> arr= new LinkedList<>();
        helper(arr,new StringBuilder(),0,0,n);
        return arr;
    }
    public void helper(List<String>arr,StringBuilder sb,int open,int close,int n){
        if(open==n && close==n){
            arr.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append("(");
            helper(arr,sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            helper(arr,sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
public class generate_par {
    public static void main(String[] args) {
        helper5 a= new helper5();
        List<String> arr=a.solu(3);
        for(String i:arr){
            System.out.println(i);
        }
    }
}
