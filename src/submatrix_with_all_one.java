import java.util.Scanner;
import java.lang.Math;
public class submatrix_with_all_one {
    public static int all_ones(int[][] m){
        int[][] res=new int[m.length][m[0].length];
        for(int i=0;i<m[0].length;i++){
            res[0][i]=m[0][i];
        }
        for(int i=0;i<m.length;i++){
            res[i][0]=m[i][0];
        }
        for(int i=1;i<m.length;i++){
            for(int j=1;j<m[0].length;j++){
                if(m[i][j]==0) res[i][j]=0;
                else{
                    res[i][j]=1+Math.min(res[i][j-1],Math.min(res[i-1][j-1],res[i-1][j]));
                }
            }
        }
        int sum=0;
        for (int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                sum+=res[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] arr= new int[][]{  {1,0,1},
                                   {1,1,0},
                                   {1,1,0}};
        System.out.println(all_ones(arr));
    }
}
