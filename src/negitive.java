public class negitive {
    public static void main(String[] args) {
        int[] arr= new int[]{-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int start=0,end=arr.length-1;
        while(start<end){
            if(arr[start]<0 && arr[end]<0){
                start++;
            }
            else if(arr[start]>0 && arr[end]<0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
            else if(arr[end]>0 && arr[start]>0){
                end--;
            }
            else{
                start++;
                end--;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
