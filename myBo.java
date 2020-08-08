public class myBo {
  public static void main(String[] args){
    Rectangle r=new Rectangle(10.0,20.0);
    System.out.println(r.getLength());
    Cube c=new Cube(10.0,20.0,30.0);
    System.out.println(c.getLength());
  }
  static class Rectangle {
    double length;
    double width;
    public Rectangle(double l, double w) {
        this.length=l;
        this.width=w;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

  }
   static class Cube extends Rectangle {
     double height;
     public Cube(double l, double w, double h) {
        super(1,w);
        this.height=h;
     }
     public double getHeight() {
       return height;
     }
   }
}
