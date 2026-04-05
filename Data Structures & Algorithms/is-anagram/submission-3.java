class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) return false;


        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        int[] frequency = new int[26];

        // List<Character> arr1 = new ArrayList<Character>(Arrays.asList(c1));
        // List<Charater> arr2 = new ArrayList<Character>(Arrays.asList(c2));

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0;i<c1.length;i++){
            frequency[c1[i]-'a']++;
        }
        for(int j=0;j<c2.length;j++){
            frequency[c2[j]-'a']--;
        }

        for (int k = 0; k < 26; k++) {
            if (frequency[k] != 0) return false;
        }

        return true;

        
    }
}
