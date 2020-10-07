package domain;

import java.util.Objects;

import static java.lang.Boolean.FALSE;
import static utility.generatorPoint.generationPoint;

public class Direction {
    private final boolean left;
    private final boolean right;

    public Direction(boolean left, boolean right) {
        if (left && right) {
            throw new IllegalStateException();
        }

        this.left = left;
        this.right = right;
        System.out.println(this);
    }

    public static Direction of(boolean first, boolean second) {
        return new Direction(first, second);
    }

    public static Direction first(Boolean right) {
        return of(FALSE, right);
    }

    public Direction next() {
        if (this.right) {
            return next(FALSE);
        }
        return next(generationPoint());
    }

    public Direction next(Boolean nextRight) {
        return of(this.right, nextRight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direction direction = (Direction) o;
        return left == direction.left &&
                right == direction.right;
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    public boolean isLeft() {
        return this.left;
    }

    public boolean isRight() {
        return this.right;
    }

    public Direction last() {
        return of(this.right, FALSE);
    }
}
