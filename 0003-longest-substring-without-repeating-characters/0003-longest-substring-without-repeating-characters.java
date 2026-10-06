class Solution {
    public int lengthOfLongestSubstring(String s) {
        int windowstart =0,
             windowend = 0;
        int n = s.length();
       HashMap<Character , Integer>map = new HashMap<>();

       int maxlen = Integer.MIN_VALUE;

       while(windowend< n){
        char ch = s.charAt(windowend);
        if(map.containsKey(ch) && map.get(ch)>=windowstart){
            windowstart = map.get(ch)+1;
        }
        map.put(ch, windowend);
        maxlen = Math.max(maxlen , windowend-windowstart +1);
        windowend++;

       }
       return (maxlen==Integer.MIN_VALUE)?0:maxlen;
    }
}