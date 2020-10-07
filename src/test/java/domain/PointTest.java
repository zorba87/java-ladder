package domain;

import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {
    @Test
    public void first(){
        assertThat(Point.first(TRUE).move()).isEqualTo(1);
        assertThat(Point.first(FALSE).move()).isEqualTo(0);
    }

    @Test
    public void next_stay(){
        Point second = Point.first(FALSE).next(FALSE);
        assertThat(second.move()).isEqualTo(1);
    }

    @Test
    public void next_left(){
        Point second = Point.first(TRUE).next(FALSE);
        assertThat(second.move()).isEqualTo(0);

    }

    @Test
    public void next_right(){
        Point second = Point.first(FALSE).next(TRUE);
        assertThat(second.move()).isEqualTo(2);
    }

    @Test
    public void next(){
        Point second = Point.first(TRUE).next();
        assertThat(second.move()).isEqualTo(0);
    }
/*

    @DisplayName("index 테스트")
    @Test
    void pointTest(){
        Point point = new Point(0,false,true);
        assertThat(point.next().getIndex()).isEqualTo(1);
        assertThat(point.next().next().getIndex()).isEqualTo(2);
    }

    @DisplayName("right & left 테스트")
    @Test
    void isRight_Test(){
        Point point = new Point(0,false,true);
        assertThat(point.isRight()).isEqualTo(true);
        assertThat(point.isLeft()).isEqualTo(false);
    }
*/
}
