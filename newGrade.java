import java.util.Scanner;

public class newGrade {
  static double gpa(double[] grades, float[] credits) {
    int i=0;
    double general_score=0;
    float all_time=0;
    for(i=0;i<3;i++) {
      general_score=general_score+grades[i]*credits[i];
      all_time=all_time+credits[i];
  }
  double g=general_score/(double)all_time;
  return g;
  }
  static double credits(String credits) {
    double grade;
    if(credits.equals("A+"))
          grade = 4.5;
    else  if (credits.equals("A"))
          grade= 4;
    else  if (credits.equals( "B+"))
          grade= 3.5;
    else  if (credits.equals( "B"))
          grade= 3;
    else  if (credits.equals("C+"))
          grade= 2.5;
    else  if (credits.equals("C"))
          grade= 2;
    else  if (credits.equals( "D"))
          grade= 1;
    else  grade= 0;
    return grade;

  }
  public static void main() {
    newGrade n=new newGrade();
    String[] subjects;
    double[] grades;
    float[] credits;
    for(int j=0;j<3;j++) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String s1=sc.next();
      double d=sc.nextDouble();
      int k=sc.nextInt();
      subjects[j]=s1;
      grades[j]=d;
      credits[j]=k;
    }
    for(int i=0;i<3;i++)
    {
      System.out.println(subjects[i]);
      System.out.println(grades[i]);
      System.out.println(credits[i]);
      System.out.println(" ");
    }
    System.out.println(newGrade.gpa(grades, credits));

  }
}
