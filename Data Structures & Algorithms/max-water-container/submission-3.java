class Solution {
    public int maxArea(int[] heights) {
        int l,dist,max=0;
        for(int i=0;i<heights.length;i++){
            int area =0;
            for(int j=i+1;j<heights.length;j++){
                dist = j-i;
                l = Math.min(heights[i],heights[j]);
                area = l*dist;
                if(area>max) max = area;
            }
        }

        return max;
    }
}
