class sol{
    public int cuckoo(int input){
        if(input==1) return 0;
        if(input==2) return 1;
        return cuckoo(input-1)+cuckoo(input-2)+3;
    }
}
public class cuckoo_sequance {
    public static void main(String[] args) {
        sol s=new sol();
        System.out.println(s.cuckoo(2));
    }
}
