class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }

        List<Integer> keys = new ArrayList<>(freq.keySet());
        keys.sort((a,b) -> freq.get(a)-freq.get(b));

        int result[] = new int[k];
        for(int i=0;i<k;i++){
            result[i] = keys.get(keys.size()-1-i);
        }

        return result;

    }
}
