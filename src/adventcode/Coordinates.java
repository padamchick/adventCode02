package adventcode;

public class Coordinates {
    private int x;
    private int y;

    public Coordinates() {
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates changePosition(char direction) {
        Move move = Move.parse(direction);
        int newX = this.x;
        int newY = this.y;
        if (x + move.getMoveX() <= 1 && x + move.getMoveX() >= -1)
            newX = x + move.getMoveX();
        if (y + move.getMoveX() <= 1 && y + move.getMoveX() >= -1)
            newY = y + move.getMoveX();
        return new Coordinates(newX, newY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
