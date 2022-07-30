public class num_seq {
    public static void main(String[] args) {
        String s="333333333333";
        System.out.println(seq(s));
    }
    public static String seq(String s){
        StringBuilder sb= new StringBuilder();
        int i,count=1;
        if(s.length() == 0){
            System.out.println("No string found");
        }
        else {
            for (i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                } else {
                    sb.append(s.charAt(i)).append(count);
                    count = 1;
                }
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                sb.append(s.charAt(i)).append(count + 1);
            } else {
                sb.append(s.charAt(i)).append(count);
                sb.append(s.charAt(i + 1)).append(1);
            }
        }
        return sb.toString();
    }
}
