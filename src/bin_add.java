
public class bin_add {
    public static void main(String[] args) {
        String s1="1010";
        String s2="1011";
        String res="";
        String carry="";
        if(s1.length()>s2.length()){
            while(s1.length()!=s2.length()){
                s2='0'+s2;
            }
        }
        else{
            while (s1.length()!=s2.length()){
                s1='0'+s1;
            }
        }
        for(int i=s1.length()-1;i>=0;i--){
            if((s1.charAt(i)=='1' && s2.charAt(i)=='1') && carry!="1"){
                res="0"+res;
                carry="1";
            }
            else if((s1.charAt(i)=='1' && s2.charAt(i)=='1') && carry=="1"){
                res="1"+res;
                carry="1";
            }
            else if((s1.charAt(i)=='0' && s2.charAt(i)=='0') && carry=="1") {
                res = "1" + res;
                carry = "";
            }
            else if((s1.charAt(i)=='1'|| s2.charAt(i)=='1')&& carry=="1"){
                res="1"+res;
                carry="";
            }
            else if(s1.charAt(i)=='0' && s2.charAt(i)=='0') {
                res = "0" + res;
                carry = "";
            }
            else{
                res="1"+res;
            }
        }
        if(carry=="1"){
            res="1"+res;
        }
        System.out.println(res);
    }
}
