public class BrickFit {
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        return (a <= w && b <= h) || (a <= h && b <= w) ||
               (a <= w && c <= h) || (a <= h && c <= w) ||
               (b <= w && c <= h) || (b <= h && c <= w);
    }

    public static void main(String[] args) {
        System.out.println(doesBrickFit(1, 1, 1, 1, 1)); // true
        System.out.println(doesBrickFit(1, 2, 1, 1, 1)); // true
        System.out.println(doesBrickFit(1, 2, 2, 1, 1)); // false
    }
}