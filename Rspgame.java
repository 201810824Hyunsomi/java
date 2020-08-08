import java.util.Scanner;
public class Rspgame {
  public String play(String s1, String s2 ) {
    String result;
    if(s1.equals(s2)) {
      result="둘이 비겼습니다!";
    }
    else if((s1.equals("가위")&&s2.equals("보"))||s1.equals("바위")&&s2.equals("가위")||s1.equals("보")&&s2.equals("바위")) {
      result="사용자 1이 이겼습니다! ";
    }
    else {
      result="사용자 2가 이겼습니다!";
    }
    return result;
  }
  public static void main(String[] args) {

    System.out.println("사용자 1과 2를 차례로 입력하세요 : ");
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    Rspgame s=new Rspgame();
    System.out.println(s.play(s1, s2));

  }
}
