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
        Move.MoveVector moveVector = move.getMoveVector();
        int newX = this.x;
        int newY = this.y;
        if (x + moveVector.getX() <= 1 && x + moveVector.getX() >= -1)
            newX = x + moveVector.getX();
        if (y + moveVector.getY() <= 1 && y + moveVector.getY() >= -1)
            newY = y + moveVector.getY();
        return new Coordinates(newX, newY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
