import java.lang.*;
public class strtoint {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int result=0,area=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            area=(r-l)*Math.min(height[l],height[r]);
            result=Math.max(result,area);
            if(height[l]<height[r]){
                l+=1;
            }
            else{
                r-=1;
            }
        }
        System.out.println(result);
    }
}
