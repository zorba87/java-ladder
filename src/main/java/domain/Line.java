package domain;

import java.util.ArrayList;
import java.util.List;

import static utility.LadderPointGenerator.generatePoint;

public class Line {
    private List<Point> points;
//    private List<Boolean> points = new ArrayList<>();

    public Line(int countOfPerson){
        // 라인의 좌표 값에 선이 있는지 유무를 판단하는 로직 추가

        init(countOfPerson);
    }

    public Line(List<Point> points){
        this.points = points;
    }

    private Line init(int countOfPerson) {
        List<Point> points = new ArrayList<>();
        Point point = initFirst(points);
        point = initBody(countOfPerson,points,point);
        initLast(points,point);
        return new Line(points);
    }

    private Point initFirst(List<Point> points) {
        Point point = Point.first(generatePoint());
        points.add(point);
        return point;
    }

    private Point initBody(int countOfPerson, List<Point> points, Point point) {
        for (int i = 1; i < countOfPerson-1; i++) {
            point = point.next();
            points.add(point);
        }

        return point;
    }

    private void initLast(List<Point> points, Point point) {
        point = point.last();
        points.add(point);
    }

}
