import java.util.Scanner;
public class subwayOprerate {
  public int subwayNumber() {
    Scanner sc=new Scanner();
    int subway_line=sc.nextInt();
    return subway_line;
  }
  public int return_Subway(int subway_line) {
    for(int i=0;i<subway_line;i++)
    {
      int runnumber=runnumber+i;
    }
  }
  public static void main(String argv[]) {
    subwayNumber s=new subwayNumber();
    System.out.println(s.subway_line());
    System.out.println(s.return_Subway(subway_line));
  }
}
