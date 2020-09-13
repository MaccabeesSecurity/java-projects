package two;
import one.CarParts;
public class Car
	{
	Simulator Sim = new Simulator();
		CarParts CP = new CarParts();
		Wheel tire = new Wheel();
		Transmission Gear = new Transmission();
		
	public static void run() 
		{  //initialize variables
			
	
			//duh while solving for logic i see that duh helped in initializing variables in the primary recursion
		
		while(CarParts.duh==false)
			  {
			if(Simulator.b==false)
					{
					Simulator.changer();
					}
						CarParts.tir();
			   }
		
			CarParts.duh=false;
		CarParts.tir();
		CarParts.Eng();
		CarParts.Fuel();
		CarParts.Trans();
			CarParts.loop();
			CarParts.looper();
			
			
			
		}
	}
