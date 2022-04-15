import java.util.ArrayList;
import java.util.List;

public class summary_range {
    public static void main(String[] args) {
        int[] arr= new int[]{0,1,2,4,5,7};
        StringBuilder st=new StringBuilder();
        List<String> l=new ArrayList<>();
        int start=arr[0];
        int end=arr[0];
        int i=1;
        while(i<arr.length){
            if(arr[i]-arr[i-1]==1){
                end=arr[i];
            }
            else{
                if(start==end) st.append(start);
                else st.append(start).append("->").append(end);
                l.add(st.toString());
                st.setLength(0);
                start=arr[i];
                end=arr[i];
            }
            ++i;
        }
        if(start==end) st.append(start);
        else st.append(start).append("->").append(end);
        l.add(st.toString());
        for(String s:l){
            System.out.println(s);
        }
    }
}
