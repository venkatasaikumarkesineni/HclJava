package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
/**
 * program for passing integers in to an array.
 * @author Coalesce.
 */

public class ArrIntEx {
  /**
   * main method.
   * @param args integer data type.
   */

  public static void main(String[] args) {
    List<Integer> num = new ArrayList<Integer>();
    num.add(new Integer(44));
    num.add(new Integer(12));
    num.add(new Integer(3));
    num.add(new Integer(25));
    num.add(new Integer(87));
    int sum = 0;
    for (Object ob:num) { 
      sum = sum + (Integer)ob;
    } 
    System.out.println(sum);
  
  }

}
