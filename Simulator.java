package two;
import one.CarParts;
public class Simulator 
	{
	public static boolean n=false;
	static Car Car = new Car();
	static CarParts CP = new CarParts();
	
	public static boolean b;
		public static void main(String[] args) 
				{
			//I need to initialize the variables in CP as full
			CarParts.duh=true;
			Car.run();
					}
			
			public static void ender() 
			{
				System.out.println("simulator ending"+" bye"+" bye");
				System.exit(0);
			}

			public static boolean set( ) 
			{
					 b = Simulator.n;
					return b;				
			}
			public static boolean get() 
			{
		       set();
				return b;
			}
			public static void changer()
			{
				b=true;
			}
			
		
}

