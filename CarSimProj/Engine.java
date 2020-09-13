package two;
import java.util.InputMismatchException;
import java.util.Scanner;

import one.CarParts;
public class Engine 
{
	//this method will read the current carparts status
	 public static void Engine()
   {
		 
		//when the engine life is less than 50.
		//tell user they need an oil change
		if(CarParts.EL<=50 && CarParts.EL>40)
		 {
			System.out.println("you need an oil change");
				    int input1=1;
			      if (input1==1) 
					{
							System.out.println("If you keep going at this rate you'll be on the side of the road.");
						
						}
					  
					}
			
			    	
		      
	     
		return;
		
    }
	 
}