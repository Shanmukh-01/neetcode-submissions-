class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int maxlength =0;

        int left =0;
        for(int right=0;right<s.length();right++){
            char rch = s.charAt(right);
            if(!seen.contains(rch)){
                seen.add(rch);
                maxlength = Math.max(maxlength,right-left+1);
            }
            else{
                while(s.charAt(left)!=rch){
                    seen.remove(s.charAt(left));
                    left++;
                }
                left++;
                seen.add(rch);
            }
        }

        return maxlength;
    }
}
