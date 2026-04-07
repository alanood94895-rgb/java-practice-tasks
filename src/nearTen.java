public class nearTen {
    public static void main(String[] args) {
        System.out.println(nearTen(12));
    }

    public static boolean nearTen(int num) {
        int remainder = num % 10;

        if (remainder == 0 || remainder == 1 || remainder == 2) {
            return true;
        }

        if (remainder == 8 || remainder == 9) {
            return true;
        }

        return false;
    }
}
