public class PrefixSuffix {
    public static boolean isPrefix(String word, String prefix) {
        return word.startsWith(prefix.substring(0, prefix.length() - 1));
    }

    public static boolean isSuffix(String word, String suffix) {
        return word.endsWith(suffix.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(isPrefix("automation", "auto-")); // true
        System.out.println(isSuffix("arachnophobia", "-phobia")); // true
        System.out.println(isPrefix("retrospect", "sub-")); // false
        System.out.println(isSuffix("vocation", "-logy")); // false
    }
}