class Solution {
    private long eattime(int[] piles, int bph ){
            long time = 0;
            for(int p : piles){
                time = time + (int)Math.ceil(1.0 *p/bph);
                
            }
            return time ;
        }
    public int minEatingSpeed(int[] piles, int h) {
         int hi= Arrays.stream(piles).max().getAsInt();
         int lo = 1;
         int ans =0;

         while(lo<=hi){
            int mid = lo + (hi-lo) /2;

            if(eattime(piles ,mid)<=h){
                ans = mid ;
                hi = mid-1;

            }else{
                lo = mid+1;
            }
         }    
         return ans ;
    }
}