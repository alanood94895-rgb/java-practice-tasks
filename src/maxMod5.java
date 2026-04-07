public class maxMod5 {
    public static void main(String[] args) {
        System.out.println(maxMod5(2, 3));

    }
    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }
}
