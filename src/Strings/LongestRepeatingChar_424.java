package Strings;

public class LongestRepeatingChar_424 {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, maxFreq = 0, len = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            int Size = right - left + 1;
            if (Size - maxFreq > k) {

                count[s.charAt(left) - 'A']--;
                left++;
            }


            len = Math.max(len, right - left + 1);
        }

        return len;
    }

}
