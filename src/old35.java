public class old35 {
    public static void main(String[] args) {
        System.out.println(old35(3));

    }

    public static boolean old35(int n) {
        boolean multipleOf3 = (n % 3 == 0);
        boolean multipleOf5 = (n % 5 == 0);
        return multipleOf3 ^ multipleOf5;
    }
}
