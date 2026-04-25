public class PointListDemo{
    public static void main(String[] args){
        Integer x = 3;
        Integer y = 6;
        Point<Integer> pair1 = new Point<>(x,y);

        String x1 = "hello";
        String y1 = "hi";
        Point<String> pair2 = new Point<>(x1,y1);

        Integer x2 = 3;
        Integer y2 = 6;
        Integer z2 = 9;
        subclassPoint<Integer> pair3 = new subclassPoint<>(x2,y2,z2);

        PointList<Point<Integer>> pair1PointList = new PointList<>(pair1);
        System.out.println(pair1PointList.toString());

        PointList<Point<String>> pair2PointList = new PointList<>(pair2);
        System.out.println(pair2PointList.toString());

        PointList<subclassPoint<Integer>> pair3PointList = new PointList<>(pair3);
        System.out.println(pair3PointList.toString());
    }
}
