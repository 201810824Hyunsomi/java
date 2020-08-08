public class GugudanMain {
  public static void main(String[] args) {
    Gugudan g=new Gugudan();
    int[] dan={1,2,3,4,5,6,7,8,9};
    g.apply(dan);
  }
}
class Gugudan {
  public void apply(int[] dan) {
    for(int i=0;i<dan.length+1;i++) {
      System.out.print(dan[i]);
      System.out.print("´Ü ");
      for(int j=1;j<=dan.length;j++) {
          System.out.printf("%d x %d= %2d ", i+1, j, (i+1)*j);
      }
      System.out.println("\n");
    }
  }
}
