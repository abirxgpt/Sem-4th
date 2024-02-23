import java.util.*;

public class Main
{
  public static void main (String[]args)
  {
	Scanner scanner = new Scanner (System.in);
	  System.out.print ("Enter 3 Floating Numbers: ");
	float num1 = scanner.nextFloat ();
	float num2 = scanner.nextFloat ();
	float num3 = scanner.nextFloat ();

	float max = num1;
	if (num2 > max)
	  {
		max = num2;
		System.out.print ("Maximum of these numbers is numbers 2 = " + num2);

	  }
	if (num3 > max)
	  {
		max = num3;
		System.out.print ("Maximum of these numbers is numbers 3 = " + num3);

	  }
	else
	  {
		System.out.print ("Maximum of these numbers is numbers 1 = " + num1);
	  }
  }
}
