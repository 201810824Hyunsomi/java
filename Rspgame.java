import java.util.Scanner;
public class Rspgame {
  public String play(String s1, String s2 ) {
    String result;
    if(s1.equals(s2)) {
      result="���� �����ϴ�!";
    }
    else if((s1.equals("����")&&s2.equals("��"))||s1.equals("����")&&s2.equals("����")||s1.equals("��")&&s2.equals("����")) {
      result="����� 1�� �̰���ϴ�! ";
    }
    else {
      result="����� 2�� �̰���ϴ�!";
    }
    return result;
  }
  public static void main(String[] args) {

    System.out.println("����� 1�� 2�� ���ʷ� �Է��ϼ��� : ");
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    Rspgame s=new Rspgame();
    System.out.println(s.play(s1, s2));

  }
}
