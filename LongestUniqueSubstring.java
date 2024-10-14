import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
    public static String longestUnique(String str) {
        int n = str.length();
        int maxLength = 0;
        String longestSubstring = "";
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (set.contains(str.charAt(j))) {
                    break;
                }
                set.add(str.charAt(j));
                if (set.size() > maxLength) {
                    maxLength = set.size();
                    longestSubstring = str.substring(i, j + 1);
                }
            }
        }
        return longestSubstring;
    }

    public static void main(String[] args) {
        System.out.println(longestUnique("abcba")); // abc
        System.out.println(longestUnique("bbb")); // b
    }
}