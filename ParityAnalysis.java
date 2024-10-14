public class ParityAnalysis {
    public static boolean parityAnalysis(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return (num % 2 == sum % 2);
    }

    public static void main(String[] args) {
        System.out.println(parityAnalysis(243)); // true
        System.out.println(parityAnalysis(12)); // false
        System.out.println(parityAnalysis(3)); // true
    }
}