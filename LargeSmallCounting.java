import.java.util.HashMap;
public class LargeSmallCounting {
static String s="7 Hongi Dong";
public static Map getFrequencies(String s) {
  Map<String, Integer> wc = new HashMap<String, Integer>();
  ArrayList<Integer> numList=new ArrayList<Integer>();
  ArrayList<String> charList1=new ArrayList<String>();
  ArrayList<String> charList2=new ArrayList<String>();
  char[] letters=s.toCharArray();
  String keyName;
  for(char c:letters) {
      char Character=(char)c;
      if (!Character.isDigit(c) && Character.isUpperCase(c)) {
          keyName="UPPER";
          charList1.add(Character.toString(c));
      } else if (!Character.isDigit(c) && Character.isLowerCase(c)) {
          keyName="LOWER";
            charList1.add(Character.toString(c));
      } else {
        keyName="NUMBER";
        numList.add(Character.getNumericValue(c));
      }
      s=Character.toString(c);
      if (wc.containsKey(keyName)) {
          wc.put(keyName,wc.get(keyName)+1);
      } else {
          wc.put(keyName,1);
      }
  }
  System.out.print(wc);
  System.out.print(numList);
  System.out.print(charList1);
  System.out.print(charList2);
  }
  public static void main(String args[]){
    LargeSmallCounting m=new LargeSmallCounting();
    m.getFrequencies(s);
  }
}
