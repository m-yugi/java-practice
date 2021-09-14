import java.util.*;
public class is_capital {
    public static void main(String[] args){
        String word="FlaG";
        boolean b=true;
        int n=word.length();
        if(n==1){
            b=true;
        }
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for(int i=2;i<n;i++){
                if(Character.isUpperCase(i)){
                    b=false;
                }
            }
        }
        else{
                for(int i=1;i<n;i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        b=false;
                    }
                }
        }
        System.out.println(b);
            }
}
