public class TargetShoot {
    public static boolean successShoot(int x, int y, int r, int m, int n) {
        int dx = x - m;
        int dy = y - n;
        return dx * dx + dy * dy <= r * r;
    }

    public static void main(String[] args) {
        System.out.println(successShoot(0, 0, 5, 2, 2)); // true
        System.out.println(successShoot(-2, -3, 4, 5, -6)); // false
    }
}