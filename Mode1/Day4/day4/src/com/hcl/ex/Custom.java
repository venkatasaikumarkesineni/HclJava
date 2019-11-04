package com.hcl.ex;
  /**
     * @author Coalesce.
     *custom exception.
     */

class InvalidEmailException extends Exception {
	/**
	 * invalid email.
	 * @param error.
	 */
	public InvalidEmailException(String error)
	{
		super(error);
	}
}
class InvalidUserNameException extends Exception
{
	/**
	 * invalid user name.
	 * @param error.
	 */
	public InvalidUserNameException(String error)
	{
		super(error);
	}
}
public class Custom
{
	/**
	 * passing arguments.
	 * @param s.
	 * @throws InvalidEmailException.
	 * @throws InvalidUserNameException.
	 */
	public void sum(String s ) 
			throws InvalidEmailException, InvalidUserNameException{
		
		boolean flag=true;
		if(s.indexOf('@')==-1){

		
			flag=false;
		throw new InvalidEmailException("inalid email");
	}
		if(s.indexOf('@')>12)
		{
			flag=false;
			throw new InvalidUserNameException("invalid useer name");
		}
		if(flag==true)
		{
			
			System.out.println("email is   " + s);
		}
		}
	/**
	 * main method.
	 * @param args.
	 */
	
  public static void main(String[] args) { 
    try { 
      new Custom().sum("sai.com");
    } catch (InvalidEmailException | InvalidUserNameException e)
		{
			e.printStackTrace();
		}
	}
}


