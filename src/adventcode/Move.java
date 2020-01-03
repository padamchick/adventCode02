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
        switch(direction) {
            case "U":
                return UP;
            case "R":
                return RIGHT;
            case "D":
                return DOWN;
            case "L":
                return LEFT;
            default:throw new IllegalArgumentException(direction);
        }
    }


}
