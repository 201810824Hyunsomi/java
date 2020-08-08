public class Updown {
  public static void main(String[] args) {
    int no=new java.util.Random().nextInt(100).val=0;
    int count=0;
    Scanner sc=new Scanner(System.in);
    while(count<10) {
      System.out.print("숫자를 부르시오: ");
      val=sc.nextInt();
      if(no==val){
        break;
      }else if(no>val) {
        System.out.println("올려");
        count++;
      } else if(count==9||no==val)
      break;
      else {
         System.out.println("밑으로");
         count++;
      }
    }
    if(no!=val)
    System.out.println("GAME OVER.");
  }
}
