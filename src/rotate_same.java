public class rotate_same {
    public static void main(String[] args) {
        //this fails when there is duplicates in strings

        String s1="nntat",s2="atata";
        int xor=0;
        for(int i=0;i<s1.length();i++){
            xor^=s1.charAt(i);
        }
        for(int i=0;i<s2.length();i++){
            xor^=s2.charAt(i);
        }
        if(xor==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
