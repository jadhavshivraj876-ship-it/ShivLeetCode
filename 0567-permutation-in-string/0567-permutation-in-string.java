class Solution {
    public boolean match(int[] a1, int[] a2){
            for(int i =0; i<a1.length ; i++){
                if(a1[i]!=a2[i]){
                    return false;
                }
            }
            return true;
        }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false ;
        }
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];

        for(char c : s1.toCharArray()){
            int idx = c - 'a';
            s1Arr[idx]++;
            
        }
        for(int i=0; i<s1.length(); i++){
            int idx = s2.charAt(i)-'a';
            s2Arr[idx]++;
        }
        for(int i =0; i<s2.length()-s1.length(); i++){
            if(match(s1Arr,s2Arr)){
                return true ;
            }
            int ridx =i+s1.length(),
               lidx = i;

            s2Arr[s2.charAt(ridx)-'a']++;
            s2Arr[s2.charAt(lidx)-'a']--;

        }
        return match(s1Arr, s2Arr);
  
    }
}