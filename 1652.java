class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if(k == 0){
            return res;
        }
        int i = 1 , j = k , sum = 0;
        if(k < 0){
            i = n - Math.abs(k);
            j = n-1;
        }
        for(int l = i ; l <= j ; l++){
            sum += code[l % n];
        }
        for(int l = 0 ; l < n ; l++){
            res[l] = sum;
            sum -= code[i % n];
            sum += code[(j+1) % n];
            i++;
            j++;
        }
        return res;
    }
}