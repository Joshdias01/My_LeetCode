package Strings;

public class DeleteCharacters_1957 {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int n = s.length();
        while (i < n) {
            int count = 1;
            char present = s.charAt(i);
            int j = i + 1;
            while (j < n && present == s.charAt(j)) {
                count++;
                j++;
            }
            if (count > 2) {
                for (int k = 0; k < 2; k++) {
                    str.append(present);
                }
            } else {
                for (int k = 0; k < count; k++) {
                    str.append(present);
                }
            }
            i = j;
        }
        return str.toString();
    }
}
