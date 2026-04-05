class Solution {
    public int characterReplacement(String s, int k) {
   
        
        int[] freq = new int[26];   // frequency array for A-Z
        int left = 0;               // left pointer of window
        int maxFreq = 0;            // highest frequency in current window
        int maxLength = 0;          // answer
        
        for (int right = 0; right < s.length(); right++) {
            
            // 1️⃣ Include current character into window
            char current = s.charAt(right);
            freq[current - 'A']++;  
            
            // 2️⃣ Update maxFreq
            maxFreq = Math.max(maxFreq, freq[current - 'A']);
            
            // 3️⃣ Check if window is invalid
            // (window size - most frequent char count) > k
            while ((right - left + 1) - maxFreq > k) {
                
                // Shrink window from left
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            
            // 4️⃣ Update maximum length after window becomes valid
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
 
    }
}
