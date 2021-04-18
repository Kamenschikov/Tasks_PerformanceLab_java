import java.util.Objects;

public class Segment {
    private Coord point1;
    private Coord point2;
    private int lenSqr;

    public Segment(Coord point1, Coord point2) {
        this.point1 = point1;
        this.point2 = point2;
        lenSqr = lenSegment();
    }

    private int lenSegment() {
        return (point2.getY() - point1.getY()) * (point2.getY() - point1.getY())
                + (point2.getX() - point1.getX()) * (point2.getX() - point1.getX());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Segment segment = (Segment) o;
        return lenSqr == segment.lenSqr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lenSqr);
    }

    @Override
    public String toString() {
        return "отрезка {" +
                point1 +
                "; " + point2 +
//                ", len=" + len +
                '}';
    }
}
