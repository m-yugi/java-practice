public class pattern{
    public static void main(String[] args) {
        int input1=3521,input2=2452,input3=1352;
        int i1=Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(0)));
        int i2=Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(1)));
        String i3=String.valueOf(input3);
        int min=Integer.MAX_VALUE;
        for(char i:i3.toCharArray()){
            int temp=Integer.parseInt(String.valueOf(i));
            if(temp<=min){
                min=temp;
            }
        }
        System.out.println((i1*i2)+min);
    }
}