class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int res[] = new int[n - k + 1];
        int i = 0;
        while(i < n - k +1){
            if(asc(nums,i,i+k)){
                res[i] = nums[i+k-1];
            }
            else{
                res[i] = -1;
            }
            i++;
        }
        return res;
    }
    public boolean asc(int[] arr,int i,int n){
        while(i < n-1){
            if(arr[i] >= arr[i+1] || arr[i] + 1 != arr[i+1] ){
                return false;
            }
            i++;
        }
        return true;
    }
}