class helper4{
    public Boolean solu(String s){
        if(s.length()==1) return true;
        if(Character.isUpperCase(s.charAt(0)) && Character.isUpperCase(s.charAt(1))){
            for(int i=2;i<s.length();i++){
                if(Character.isLowerCase(s.charAt(i))){
                    return false;
                }
            }
        }
        else {
            for(int i=1;i<s.length();i++){
                if(Character.isUpperCase(s.charAt(i))){
                    return false;
                }
            }

        }
        return true;
    }
}
public class allcap {
    public static void main(String[] args) {
        helper4 a= new helper4();
        System.out.println(a.solu("leetcode"));
    }
}
