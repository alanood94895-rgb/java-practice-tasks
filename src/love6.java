public class love6 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));  // Test the love6 method

    }

    public static boolean love6(int a, int b) {

        if (a == 6 || b == 6) {
            return true;
        }

        if (a + b == 6) {
            return true;
        }

        if (Math.abs(a - b) == 6) {
            return true;
        }

        return false;
    }
}


