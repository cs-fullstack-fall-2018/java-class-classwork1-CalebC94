public class SideMain {
    public static void main(String[] args) {
//        Point xy = new Point();
//        xy.printPoint();
//
//        Point x2y2 = new Point(5, 6);
//        x2y2.printPoint();
//
//        Point x3y3 = new Point(2, -5);
//        x3y3.printPoint();



        Dog Pungo = new Dog("Juice", "bullmastiff", 3, "black and white");
        System.out.println(Pungo);




        Bicycle Next = new Bicycle(65, 15, 2);
        System.out.println(Next);


        Point zy = new Point();

        Point point1 = new Point();
        point1.center(zy).printPoint();


    }

}
