import java.util.*;
import java.lang.*;
public class coffeeMake {
  static String[][] allData= {{"Long Black","Yes","No","No"},
    {"Flat White","No","Yes","No"},
    {"Cappuccino","No","Yes","No"},
    {"Affogato","No","No","Yes"},
{"coffee", "water", "milk", "icecream"},{"espresso", "no", "no", "no"}};
  public static double CountMilkadd(String[][] allData) {
    int count=0;
    for(String[] r:allData){
      if(r[2].equals("Yes")){
        count+=1;
      }
    }
    double rate=100.0*(double)count/allData.length;
    return rate;
  }
  public static void main(String[] argv) {
    String[][] copied=new String[5][4];
    for(int i=0;i<allData.length;i++) {
      for(int j=0;j<allData[i].length;j++) {
        copied[j-1][i]=allData[i][j];
      }
    }
    System.out.println("coffee add? ");
    for(String[] r:copied)
      System.out.printf("%s\n", r[2]);
    System.out.println(CountMilkadd(allData));
  }
}
