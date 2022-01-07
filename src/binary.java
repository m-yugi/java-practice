public class binary {
    public static void main(String[] args) {
        int[] arr={1,3,5,6};
        System.out.println(search(arr,2,0, arr.length-1));
    }
    public static int search(int[] arr, int num,int start,int end){
        if(end>=start) {
            int mid = start+((end - start) / 2);
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                return search(arr, num, start, mid-1);
            } else {
                return search(arr, num, mid +1 , end);
            }
        }
        return start;
    }
}
