class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int currentsum =0;
            for(int j=i;j<nums.length;j++){
                currentsum += nums[j];
                if(currentsum>max){
                    max = currentsum;

                }
            }
        }

        return max;
    }
}
