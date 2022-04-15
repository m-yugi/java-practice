public class revrse_string {
    public static void main(String[] args) {
        String s="yugandhar";
        int j=s.length()-1;
        StringBuilder sb= new StringBuilder(s);
        for(int i=0;i<s.length()/2;i++){
            char temp=s.charAt(i);
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,temp);
            j--;
        }
        System.out.println(sb.toString());
    }
}
