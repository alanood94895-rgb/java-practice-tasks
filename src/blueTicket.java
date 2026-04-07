public class blueTicket {
    public static void main (String[] args) {
        System.out.println(blueTicket(9, 1, 0));
    }
    public static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        }

        if (ab == bc + 10 || ab == ac + 10) {
            return 5;
        }

        return 0;
    }
}


