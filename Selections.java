package com.sd.select;
import java.util.ArrayList;
public static class Selections {
    ArrayList<Rectangle> sArr=new ArrayList<Rectangle>();
    public void select(Rectangle r) {
        r.setSelected(true);
        sArr.add(r);
        System.out.println("selected: "+r.isSelected);
    }
    public void print() {
        for(Rectangle r:sArr)
            System.out.println(r.toString());
    }
    public static void main(String[] args){
      Rectangle r=new Rectangle(20,30);
      Selections s=new Selections();
      System.out.println(s.select(r));
      System.out.println(s.print());
    }
}
