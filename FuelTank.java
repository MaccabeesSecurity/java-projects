package two;

import java.util.InputMismatchException;
import java.util.Scanner;

import one.CarParts;
public class FuelTank
	{
	public static boolean d=false;
	public static boolean REfuel;
	//variables
	
	public static void Refuel()
	{
		if(CarParts.EL < 7)
			{
				System.out.println("gas line has been severed!!");
				System.out.println("your stuck on the side of the road");
				//end program
				Simulator.ender();
			}
				if(CarParts.FT<=20)
				{
					System.out.println("youll need to fill up soon.");
				}
			d=true;
			CarParts.setFT();
	}
}
