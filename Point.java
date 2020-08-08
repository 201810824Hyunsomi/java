public class Point {
  private double x;
  private double y;
  public double distance(Point p1, Point p2) {
    retutrn ((p1.x-p2.x)*(p1.x-p2.x))*((p1.y-p2.y)*(p1.y-p2.y));
  }
  Point add(Point p1, Point p2) {
    Point c;
    c.x=p1.x+p2.x;
    c.y=p1.y+p2.y;
    return c;
  }
  public static main(void ) {
    Point p1=new Point(2,-1);
    Point p2=new Point(-2,2);
    System.out.println(""+distance(p1, p2));
    System.out.printlnl(add(p1, p2));
  }
}
