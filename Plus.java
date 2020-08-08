public class Plus {
  public int add(int num1, int num2) {
    int res;
    res=num1+num2;
    return res;
  }
  public static void main (String[] args) {
    Plus p=new Plus();
    int a=3;
    int b=5;
    System.out.println("end : "+p.add(a,b));
  }
}
