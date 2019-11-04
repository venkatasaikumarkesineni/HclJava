package com.hcl.ex;

import javax.swing.JSpinner.NumberEditor;
/**
 * sai kumar.
 * @author Coalesce.
 */

public class Ex3 { 
  /**
* main method.
*/
  public static void main(String[] args) {
    try { 
      System.out.println("A");
      throw new NullPointerException();
    } catch (ArithmeticException e) { 
      System.out.println("e");
    } catch (NullPointerException e) { 
      //System.out.println("error");//
      throw new NumberFormatException();
    } catch (NumberFormatException e) {
      System.out.println(" re thrown error with another exception");
    }
  }
}

