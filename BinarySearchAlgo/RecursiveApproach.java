public class RecursiveApproach {
    static boolean binarySearch(int[] arr,int start,int end,int target){
        if(start > end) return false;
        int mid =(start+end)/2; // some time it gives overflow
        // int mid = start + (end - start)/2; // to avoid overflow
        if(target == arr[mid]){
            return true;
        } else if (target < arr[mid])  {
            return binarySearch(arr,start,mid-1,target);
        }else{
            binarySearch(arr,mid+1,end,target);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {4,12,54,67,73,87,90};
       // int target = 67;// true
        int target = 67;// false
        int n = arr.length;
        int start = 0, end = n-1;
        System.out.println(binarySearch(arr,start,end,target));
    }
}
