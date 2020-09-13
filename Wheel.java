package two;
import one.CarParts;

public class Wheel
{
	public static String Flat = "Your tire is flat.";
	//tire will catch a flat at <30
	public static void wheel()
	{
		double dude=3.02;
		while ( CarParts.Tt < dude )
		{
			
			System.out.println(Flat);
			Simulator.ender();
			
			
		}
		
	CarParts.setTt();
	}

}