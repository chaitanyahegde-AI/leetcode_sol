class Solution {
    public long countCommas(long n) {
        long res = 0 ;
        if(n>999){
            res+=n-999 ;

        }
        if(n>999999){
            res+=(n-999999L) ;

        }
        if(n>999999999){
            res+=(n-999999999L);

        }
        if(n>999999999999L){
        res+=(n-999999999999L);
        }
        if(n>999999999999999L){
            res+=(n-999999999999999L);

        }
        return res ;

    }
}