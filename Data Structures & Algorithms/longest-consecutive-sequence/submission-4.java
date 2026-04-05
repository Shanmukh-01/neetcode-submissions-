class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) 
            return 0;
        
        HashSet<Integer> seen = new HashSet<>();

        for(int n:nums){
            seen.add(n);
        }
        int longest = 0;
        for(int num:seen){
            if(!seen.contains(num-1)){
                int current = num;
                int streak = 1;

                while(seen.contains(current+1)){
                    current++;
                    streak++;
                }
                longest = Math.max(longest,streak);
            }
        }

        return longest;
    }
}
