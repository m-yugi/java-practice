import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cooking {
    public static void main(String[] args) {
        boolean res=false;
        String[] recipes={"ju","fzjnm","x","e","zpmcz","h","q"};
        String[][] ingredients={{"d"},{"hveml","f","cpivl"},{"cpivl","zpmcz","h","e","fzjnm","ju"},{"cpivl","hveml","zpmcz","ju","h"},{"h","fzjnm","e","q","x"},{"d","hveml","cpivl","q","zpmcz","ju","e","x"},{"f","hveml","cpivl"},{"f","hveml","cpivl","d"}};
        String[] supplies={"f","hveml","cpivl","d"};
        List<String> result= new ArrayList<>();
        for(int i=0;i<recipes.length;i++){
            for(int j=0;j<ingredients[i].length;j++){
                if((Arrays.asList(supplies).contains(ingredients[i][j])|| result.contains(ingredients[i][j]))==true) {
                    res=true;
                }
                else {
                    res=false;
                    break;
                }
                }
            if(res){
                result.add(recipes[i]);
            }
            for(int k=0;i<recipes.length;k++){
                if(!result.contains(recipes[i])){
                    for(int j=0;j<ingredients[i].length;j++){
                        if((Arrays.asList(supplies).contains(ingredients[i][j])|| result.contains(ingredients[i][j]))==true) {
                            res=true;
                        }
                        else {
                            res=false;
                            break;
                        }
                    }
                    if(res){
                        result.add(recipes[i]);
                    }
                }
            }
        }
        for(String i:result){
            System.out.println(i);
        }
    }
}
