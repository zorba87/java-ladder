package domain;

public class Point {
    private Direction direction;
    private int index;

    public Point() {

    }

    public Point(int index, Direction direction) {
        this.index = index;
        this.direction = direction;
    }

    public int move() {
        if (direction.isRight()) {
            return index + 1;
        }
        if (direction.isLeft()) {
            return index - 1;
        }
        return this.index;
    }


    public static Point first(Boolean right) {
        return new Point(0, Direction.first(right));
    }

    public Point next(Boolean right) {
        return new Point(index + 1, direction.next(right));
    }

    public Point next() {
        return new Point(index + 1, direction.next());
    }

    public Point last() {
        return new Point(index + 1, direction.last());
    }
}
