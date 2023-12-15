// Q. Find the square root of the given non-negative value x. Round it off to the nearest floor integer value.
// Input : x = 4
// Output : 2
public class problem_2 {
    static  int squareRoot(int x){
        int start = 0, end = x;
        int ans = -1;
        while( start <= end){
            int mid = start + (end - start)/2;// to avoid the overflow condition
            int value = mid * mid;
            if(value == x){
                return mid;
            } else if (value < x) {
                ans = mid ;
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareRoot(25));
    }

}
