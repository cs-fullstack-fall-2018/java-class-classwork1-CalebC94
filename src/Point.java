public class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
//  String center(Point other){
    Point center(Point other){
//        Returns the center between this point the other point
//        Notice we are using integer, we won't get an accurate value
        return new Point((x + other.x) / 2, (y + other.y) / 2);
//      return (((x + other.x)/2) + ", " + (y + other.y)/2));
    }
}
