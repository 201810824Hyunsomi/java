import java.util.Scanner;
abstract class Hello {
      protected String name;
      public Hello(String name) {
          this.name=name;
      }
      abstract public void sayHello();

  protected class HelloChinese extends Hello {
      public HelloChinese(String name) {
          super(name);
      }
      @Override
      public void sayHello() {
          System.out.println("你好 "+ name);
      }
  }
  protected class HelloJapanese extends Hello {
      public HelloJapanese(String name) {
          super(name);
      }
      @Override
      public void sayHello() {
          System.out.println("こんにちは "+ name);
      }
  }
  protected class HelloKorean extends Hello {
      public HelloKorean(String name) {
          super(name);
      }
      @Override
      public void sayHello() {
          System.out.println("안녕하세요 "+ name);
      }
  }
public void main(String argv[]) {
  Hello[] h=new Hello[3];
  h[0]=new HelloKorean("hsm");
  h[1]=new HelloJapanese("hsm");
  h[2]=new HelloChinese("hsm");
  for(int i=0;i<h.length;i++)
    h[i].sayHello();
  }
}
