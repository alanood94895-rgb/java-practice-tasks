public class caughtSpeeding {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(66, false));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int noTicketLimit = 60;
        int smallTicketLimit = 80;

        if (isBirthday) {
            noTicketLimit += 5;
            smallTicketLimit += 5;
        }

        if (speed <= noTicketLimit) {
            return 0;
        } else if (speed <= smallTicketLimit) {
            return 1;
        } else {
            return 2;
        }
    }
}