import ch.aplu.turtle.*;
import java.awt.geom.Point2D;
import java.util.Scanner;
public class drawType {
    void drawType_1(int size, int n) {
    Scanner sc=new Scanner();
    System.out.print("Enter an n: ");
    int n=sc.nextInt();
    System.out.print("Enter an size: ");
    int size=sc.nextInt();
    for(int i=0;i<n;i++) {
      t1=forward(size);
      t1.right(180/n);
    }
    PUblic void main {
      Turtle t1=new Turtle();
      t1.home();
      t1.clear();
      System.out.println(drawType_1());
    }
}
