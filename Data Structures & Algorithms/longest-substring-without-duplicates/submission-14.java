class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxlength = 0;
        Map<Character,Integer> freq = new HashMap<>();
        
        for(int right =0 ; right<s.length();right++){
            char ch = s.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);

            while(freq.get(ch)>1){
                char leftchar = s.charAt(left);
                freq.put(leftchar,freq.get(leftchar)-1);
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
        }


        return maxlength;
    }
}
