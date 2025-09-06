package Strings;

public class RepeatedSubStringPattern_459 {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length() / 2; i++) {
            // if(s.length()%i != 0)
            //     continue;
            str.append(s.charAt(i));
            for (int j = 0; j < s.length() - i; j = j + i + 1) {
                // System.out.println(s.substring(j, j + i + 1)+"  "+str.toString());
                if (s.substring(j, j + i + 1).equals(str.toString())) {
                    if (j + i + 1 == s.length()) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

}
