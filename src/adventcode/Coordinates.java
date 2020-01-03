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

    public Coordinates changePosition(String direction) {
        Move move = Move.parse(direction);
        int newX = this.x;
        int newY = this.y;
        if (move.getMoveX()!=0 && x + move.getMoveX() <= 1 && x + move.getMoveX() >= -1)
            newX = x + move.getMoveX();
        if (move.getMoveY()!=0 && y + move.getMoveY() <= 1 && y + move.getMoveY() >= -1)
            newY = y + move.getMoveY();
        return new Coordinates(newX, newY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
