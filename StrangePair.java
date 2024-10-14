public class StrangePair {
    public static boolean isStrangePair(String str1, String str2) {
        if (str1.isEmpty() && str2.isEmpty()) {
            return true;
        }
        if (str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        return str1.charAt(0) == str2.charAt(str2.length() - 1) &&
               str1.charAt(str1.length() - 1) == str2.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(isStrangePair("ratio", "orator")); // true
        System.out.println(isStrangePair("sparkling", "groups")); // true
        System.out.println(isStrangePair("bush", "hubris")); // false
        System.out.println(isStrangePair("", "")); // true
    }
}