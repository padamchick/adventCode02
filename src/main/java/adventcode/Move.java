package adventcode;

public enum Move {

    UP(0,1),
    RIGHT(1,0),
    DOWN(0,-1),
    LEFT(-1,0);

    private final int moveX;
    private final int moveY;

    Move(int moveX, int moveY) {
        this.moveX = moveX;
        this.moveY = moveY;
    }

    public int getMoveX() {
        return moveX;
    }

    public int getMoveY() {
        return moveY;
    }

    public static Move parse(String direction) {
        if ("U".equals(direction)) {
            return UP;
        } else if ("R".equals(direction)) {
            return RIGHT;
        } else if ("D".equals(direction)) {
            return DOWN;
        } else if ("L".equals(direction)) {
            return LEFT;
        }
        throw new IllegalArgumentException(direction);
    }


}
