class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int count = 0 ;
        int i = 0 ;
        int ans = 0 ;

        for(i =0 ; i < k ; i++){
            if(blocks.charAt(i)=='W')count++;

        }
        ans = count ;
        for(i = k ;i < n ; i++){
            if(blocks.charAt(i-k)=='W')count--;
            if(blocks.charAt(i)=='W')count++;
            ans = Math.min(ans,count);

        }
        return ans ;
    }
}