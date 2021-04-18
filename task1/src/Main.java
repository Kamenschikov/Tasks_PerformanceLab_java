public class Main {
    public static void main(String[] args) {
        Segment segment1 = new Segment(new Coord(1, 1), new Coord(2, 2));
        Segment segment2 = new Segment(new Coord(-3, 0), new Coord(1, 1));
        System.out.println(compareLength(segment1, segment2));

        Segment segment3 = new Segment(new Coord(0, 0), new Coord(1, 1));
        System.out.println(compareLength(segment1, segment3));

        Segment segment4 = new Segment(new Coord(10, -10), new Coord(9, -6));
        System.out.println(compareLength(segment2, segment4));
    }

    private static String compareLength(Segment segment1, Segment segment2) {
        return "Длина " + segment1 + " и " + segment2 + (segment1.equals(segment2)? " равна ": " не равна ") ;
    }
}
