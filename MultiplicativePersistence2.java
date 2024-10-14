public class MultiplicativePersistence2 {
    public static int bugger(int num) {
        int count = 0;
        while (num >= 10) {
            int product = 1;
            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }
            num = product;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(bugger(39)); // 3
        System.out.println(bugger(999)); // 4
        System.out.println(bugger(4)); // 0
    }
}