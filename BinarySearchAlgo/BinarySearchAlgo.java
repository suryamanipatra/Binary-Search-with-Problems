public class BinarySearchAlgo {
    static boolean binarySearch(int[]arr,int target){
        int n = arr.length;
        int start = 0,end = n-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target == arr[mid]){
                return true;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {4,12,54,67,73,87,90};
        int target = 57;//false
       // int target = 67;//true
        System.out.println(binarySearch(arr,target));
    }
}
