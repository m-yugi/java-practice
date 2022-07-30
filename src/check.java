import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class check {
    public static void main(String[] args) {
        List<String> s= new ArrayList<>();
        s.add("abc");
        s.add("cba");
        s.add("qwe");
        s.add("s");
        s.add("sssll");
        s.add("ewq");
        hello(s);
    }
    public static void hello(List<String> arr){
        List<List<Integer>> l=new ArrayList<>();
        if(arr.size()==0) System.out.println("No element Found");
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i).length()==arr.get(j).length()){
                    int k,end=arr.get(i).length()-1;
                    for(k=0;k<arr.get(i).length();k++){
                        if(arr.get(i).charAt(k)==arr.get(j).charAt(end)){
                            end--;
                        }
                        else break;
                    }
                    System.out.println(k+" "+end);
                    if(k==arr.get(i).length() && end==-1){
                        System.out.println(i+" "+j);
                        l.add(new ArrayList<>(Arrays.asList(i,j)));
                    }
                }
            }
        }
        if(l.size()==0) System.out.println("No reverse pair found");
        else System.out.println(l);
    }
}
