package domain;

import static java.lang.Boolean.FALSE;

public class Direction {
    private boolean left;
    private boolean right;

    public Direction(boolean left, boolean right) {
        if (left && right) {
            throw new IllegalStateException();
        }

        this.left = left;
        this.right = right;
        System.out.println(this);
    }

    public boolean isRight() {
        return this.right;
    }

    public boolean isLeft() {
        return this.left;
    }

    public Direction next(Boolean nextRight) {
        return of(this.right, nextRight);
    }

    public Direction next() {
        if (this.right){
            return  next(FALSE);
        }
        return next(true);
    }

    private static Direction of(boolean first, Boolean second) {
        return new Direction(first, second);
    }

    public static Direction first(boolean right){
        return of(FALSE,right);
    }
    public Direction last() {
        return of(this.right,FALSE);
    }

}
