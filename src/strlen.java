public class strlen {
    public static void main(String[] args) {
        String[] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int maxcount=0,count=1;
        for(String i : sentences){
            for(int j=0;j<i.length()-1;j++){
                if(i.charAt(j)==' '){
                    count++;
                }
            }
            maxcount=Math.max(maxcount,count);
            count=1;
        }
        System.out.println(maxcount);
    }
}
