class Solution {
    public int search(int[] nums, int target) {
        // boolean found = false;
        // int a;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                // found = true;
                return i;
            }
        }
        return -1;
    }
}
