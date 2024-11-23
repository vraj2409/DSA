class Solution {
    public int reverse(int x) {
       int n = Math.abs(x) , r = 0;
       while(n != 0){
        int l = n % 10;
        if(r > (Integer.MAX_VALUE - l)/10){
            return 0;
        }
        r = r * 10 + l;
        n = n / 10;
       }  
       return (x < 0) ? (-r) : r;
    }
}