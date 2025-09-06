package Strings;

import java.util.Arrays;

public class PermutationInString_567 {
    public boolean checkInclusion(String s1, String s2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        if (s1.length() > s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            f1[s1.charAt(i) - 'a']++;
            f2[s2.charAt(i) - 'a']++;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(f1, f2))
                return true;

            f2[s2.charAt(i) - 'a']++;
            f2[s2.charAt(i - s1.length()) - 'a']--;
        }
        if (Arrays.equals(f1, f2))
            return true;
        return false;
    }
}
