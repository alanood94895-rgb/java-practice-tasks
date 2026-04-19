public class CigarParty {
    public static void main(String[] args) {
        System.out.println(cigarParty(70, false));   // Test the cigarParty method
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            if (cigars >= 40) {
                return true;
            }
            return false;
        } else {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            }
            return false;
        }
    }
}

