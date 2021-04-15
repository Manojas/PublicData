package Com.Mindtree.Utility;

public class MyException extends Exception {
public MyException(String s)
{
	super(s);
	System.out.println(s);
}
}
