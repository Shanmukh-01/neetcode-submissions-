class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1>n2) return false;

        int[] s1count = new int[26];
        int[] s2count = new int[26];

        for(int i=0;i<n1;i++){
            s1count[s1.charAt(i)-'a']++;
            s2count[s2.charAt(i)-'a']++;;
        }

        for(int i=0;i<n2-n1;i++){
            if(Arrays.equals(s1count,s2count)) return true;

            s2count[s2.charAt(i)-'a']--;
            s2count[s2.charAt(i+n1)-'a']++;
        }

        return Arrays.equals(s1count,s2count);
    }
}
