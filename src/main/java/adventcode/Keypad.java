package adventcode;

public class Keypad {
    private static final String[][] KEYPAD = new String[][] {
            new String[] {"7", "8", "9"},
            new String[] {"4", "5", "6"},
            new String[] {"1", "2", "3"}
    };

    public static int convert (Coordinates coordinates) {
        return Integer.parseInt(KEYPAD[coordinates.getY()+1][coordinates.getX()+1]);
    }

    public String[][] getKEYPAD() {
        return KEYPAD;
    }
}
