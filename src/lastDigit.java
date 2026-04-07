public class lastDigit {
    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13));
    }

    public static boolean lastDigit(int a, int b, int c) {
        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;

        if (lastA == lastB) {
            return true;
        }
        if (lastA == lastC) {
            return true;
        }
        if (lastB == lastC) {
            return true;
        }
        return false;
    }
}
