package com.hcl.ex;
/**
 * program for throwing exception.
* @author coalesce  .
 */

public class ThrEx {
  /**
   * program for throwing exception.
   * @param x string argument.
   */
  public void show(int x) { 
    boolean flag = false;
    if (x < 0) { 
      flag = false;
      throw new NumberFormatException("negative numberis not allowed");
    } 
    if (x == 0) { 
      flag = false;
      throw new ArithmeticException("zero is invalid");
    } 
    if (flag == true) {
      System.out.println("x value is " + x);
    }
  }
  /**
    * number as inputs.
   * @param args n is passing.
   */
  
  public static void main(String[] args) { 
    int n = -12;
    try {
      new ThrEx().show(n);
    } catch (NumberFormatException e) { 
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) { 
      System.out.println(e.getMessage());
    } catch (Exception e) { 
      e.printStackTrace();
    }
  }
}


