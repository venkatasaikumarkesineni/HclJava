package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
/**
 * Program for array employ in collections.
 * @author Coalesce.
 */

public class ArrEmploy {
  /**
   * main method.
   * @param args employ details are passing.
   */

  public static void main(String[] args) {
    List<Employ> lstEmploy = new ArrayList<Employ>();
    lstEmploy.add(new Employ(1,"Anisha",565445));
    lstEmploy.add(new Employ(2,"sai",5654456));
    lstEmploy.add(new Employ(3,"siri",565447));
    lstEmploy.add(new Employ(4,"pove",565448));
    lstEmploy.add(new Employ(5,"pora",565449));
    for (Object ob : lstEmploy) { 
      Employ e = (Employ)ob;
      System.out.println(e);
    }
  }

}
