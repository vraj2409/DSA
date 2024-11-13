import java.util.*;
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int i = 0;
        long c = 0;
        while(i < nums.length){
            int j = binarySearch(nums, lower - nums[i],i+1);
            int k = binarySearch(nums, upper - nums[i] + 1,i+1);
            c +=(k-j);
            i++;
        }
        return c;
    }
    public int binarySearch(int[] matrix, int x , int lo) {
        int hi = matrix.length; 
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (matrix[mid] >= x) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}