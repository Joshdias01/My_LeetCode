package Strings;

import java.util.HashSet;

public class LongestSubString_3 {
        public int lengthOfLongestSubstring(String s) {
            int left=0,right=0,max=0;
            HashSet<Character> checks = new HashSet<>();

            //checks.add(s.charAt(left));
            for(right=0;right<s.length();right++)
            {
                while(checks.contains(s.charAt(right)))
                {
                    checks.remove(s.charAt(left));
                    left++;
                }
                checks.add(s.charAt(right));
                max=Math.max(max,right-left+1);
            }
            return max;
        }

}
