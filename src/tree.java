import java.util.LinkedList;
import java.util.List;
class helper6{
    List<Integer> sorter(List<Integer> l1,List<Integer> l2){
        int i=0,j=0;
        List<Integer> arr= new LinkedList<>();
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)>l2.get(j)){
                arr.add(l2.get(j));
                j++;
            }
            else{
                arr.add(l1.get(i));
                i++;
            }
        }
        if(i!=l1.size()){
            while(i<l1.size()){
                arr.add(l1.get(i));
                i++;
            }
        }
        if(j!=l2.size()){
            while(j<l2.size()){
                arr.add(l2.get(j));
                j++;
            }
        }
        return arr;
    }
}

public class tree {
    public static void main(String[] args) {
        List<Integer> arr=new LinkedList<>();
        List<Integer> arr2=new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr2.add(0);
        arr2.add(1);
        arr2.add(3);
        helper6 a= new helper6();
        List<Integer> sum=a.sorter(arr,arr2);
        for(int i:sum){
            System.out.println(i);
        }
    }
}
