//WRITE A JAVA PROGRAM TO PRINT SUM OF 5 INTEGERS BY TAKING THEM FROM COMMAND LINE ARGUMENT



public class Main
{
  public static void main (String[]args)
  {
	int sum = 0;
	for (String arg:args)
	  {
		sum += Integer.parseInt (arg);
	  }
	System.out.print ("Sum of the Numbers are: " + sum);
  }
}
