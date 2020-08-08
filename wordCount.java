import java.util.*;
public class wordCount {
  public Map countChars(String str ){
    Map<String, Integer> wc = new HashMap<String, Integer>();
    char[] letters = str.toCharArray();
    String s;
    for(char c:letters) {
        s=Character.toString(c);
        if (wc.containsKey(s)) {
            wc.put(s,wc.get(s)+1);
        } else {
            wc.put(s,1);
        }
    }
    return wc;
  }
  public static void main(String[] argv) {
    wordCount w=new wordCount();
    String s1="hyunsomi";
    String s2="baie";
    System.out.println(w.countChars(s1));
    System.out.println(w.countChars(s2));
  }

}
