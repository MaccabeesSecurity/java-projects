package two;

import one.CarParts;

public class Transmission 
{
 
	
	
	public static String GC = "your car has 6 gears";
    public static boolean d=false;

        //return report on how many gears the user has.
     public static void Gears() 
		{  
    	 
    	 if(CarParts.TF< 95 && CarParts.TF > 90)
			{
				GC="your car has 6 gears";
				System.out.println(GC);
			}
			d=true;
			CarParts.setTr();
		}
     
		
			
			
    
}