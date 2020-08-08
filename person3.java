public class Person3 {
  private String name;
  private float weight;
  public Person3(String name) {
    this.name=name;
  }
  public String getName() {
    return name;
  public String getWeight() {
    return weight;
  }
  public void setWeight(float weight) {
    this.weight=weight;
  }
  public static void main(String[] args) {
    Person3 p=new Person3{"kim"};
    p.setWeight((float)65.0);
    System.out.println(p.getName()+" "+p.getWeight()+"kg");
  }
}
