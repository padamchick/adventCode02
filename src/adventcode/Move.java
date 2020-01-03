package adventcode;

public enum Move {
    UP(new MoveVector(0,1)),
    RIGHT(new MoveVector(1,0)),
    DOWN(new MoveVector(0,-1)),
    LEFT(new MoveVector(-1,0));
    

    Move(MoveVector moveVector) {
        this.moveVector=moveVector;
    }

    public static Move parse(char direction) {
        switch(direction) {
            case 'U':
                return UP;
            case 'R':
                return RIGHT;
            case 'D':
                return DOWN;
            case 'L':
                return LEFT;
            default:throw new IllegalArgumentException();
        }
    }

    private final MoveVector moveVector;

    public static class MoveVector {
        private final int x;
        private final int y;

        private MoveVector(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public MoveVector getMoveVector() {
        return moveVector;
    }
}
