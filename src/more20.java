public class more20 {
    public static void main(String[] args) {
        System.out.println(more20(20)); // false
    }

    public static boolean more20(int n) {

        if (n % 20 == 1) {
            return true;
        }

        if (n % 20 == 2) {
            return true;
        }

        return false;
    }
}
