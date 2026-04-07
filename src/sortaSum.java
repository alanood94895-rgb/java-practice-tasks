public class sortaSum {
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));
    }
    public static int sortaSum(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 19) {
            return 20;
        }

        return sum;
    }
}
