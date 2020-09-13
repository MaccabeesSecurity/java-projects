package one;
import java.util.*;


import two.*;




public class CarParts implements Viewer  
	{
	public static boolean duh;
			// initialize variables
			static int full = 100;
			static double fulltire = 30.0;
				static double dectir = 3.2;
				static int decmot = 10;
				static int decTrans= 7;
				static int decgas= 10;
				public static double Tt;
				public static int EL;
				public static int TF;
				public static int FT;
				public static double setTt;
				static int choice;
				static Scanner cin = new Scanner(System.in);
				static int input;
				public static boolean z;
				
				
		
				public static void Status()
				{	
							
					prTrans();
					prEng();
					prTire();
					prfuel();
		          //From here down will serve as a loop for the program
					
					loop();
					looper();	
					 
					
				}
	//Tires
		public static double tir() 
			{
				//if boolean n is false the variables are full
			while(Simulator.b == true)
				{
				    z= false;
					setTt();
									
				}
				return Tt=fulltire;
			
			}
		
	public static void setTt() 
		{
		if (z==false)
		{
			z=true;
		   Tt=Tt-dectir;
		   Wheel.wheel();
		   getTt();
		}
		   Eng();
		   
		}	
	public static double getTt() 
		{
		  return Tt;
		  
		}
		
		//Engine
		public static int Eng() 
			{
			//if boolean n is false 100%
			//if boolean n is false the variables are full
			while(Simulator.b == true)
				{
					setEL();
					
				}
			
				  return EL =full;
			  }
	public static void setEL() 
		{
		if (z==true)
			{
				z=false;
			   EL=EL-decmot;
			   Engine.Engine();
			   getEL();
			}
		   Fuel();
		}	
	public static int getEL() 
		{
		return EL;	
		}
		
	//FUEL
		
	public static int Fuel() 
			{
	//if boolean n is false the variables are full
			while(Simulator.b == true)
				{
					setFT();
				}
				
			   	   return FT=full;
			}
			
	public static void setFT() 
	{
		if (z==false)
		  {
			if (FuelTank.d==false)
					{
						z=true;
						FT=FT-decgas;
						FuelTank.Refuel();
					}
			getFT();				
		  }
				Trans();
				
	}
		public static int getFT() 
			{
				return FT;
			}

	//Transmission
		public static int Trans()
			{
	//if boolean n is false the variables are full
			while(Simulator.b == true)
				{
					setTr();
				}
				
				   TF=full;
				   return TF;
			}
		public static void setTr() 
		{
		  if(z==true)
			{
			   if(Transmission.d==false)
				   {
				   		z=false;
						TF=TF-decTrans;
						Transmission.Gears();
					}
			   getTr();
			}
			
		  while(CarParts.z==false) 
	        {
			  FuelTank.d=false;
			  Transmission.d=false;
			CarParts.loop();
			CarParts.looper();	
	        }
			
		}
		
		public static int getTr()
		{
			return TF;
		}
		
		
		
		//These methods will receive and print all current data for the carparts
		public static void prTrans()
		{
			System.out.println("	Your transmission is in "+getTr()+"% condition.");
		}
		
		public static void prEng()
		{
			System.out.println("	Your engine is at "+getEL()+"%  condition.");
		}
		
		public static void prTire()
		{
			System.out.println("	Your tire tread is at "+getTt()+"cm");
		}
		
		public static void prfuel()
		{
			System.out.println("	You have "+getFT()+ "% of your gas left");
		}
		public static void loop() 
		{
			//creating variables for user input
			String ch="I want you to choose!";
			String A="start car";
			String MessA="*Starting the car will put ware on the car and cost resources.";
			String B="Get check up";
			String MessB="*This will show the cars parts status.";
			String C="Turn off Car";
			String MessC="*This selection will end the program.";
		//gives the initial status for parts when false
		//prompt user
					System.out.println(ch);
					System.out.println("1). "+ A);
					System.out.println(MessA);
					System.out.println("2). "+ B);
					System.out.println(MessB);
					System.out.println("3). "+ C);
					System.out.println(MessC);
					
		}
		public static void looper() {
			while(choice != 1 || choice != 2 || choice != 3)
			{
				
				//Ask the user to enter 1,2,or3.
				//user input
				//start input ability.
				 
					System.out.println("choose now..");
				while(true) 
					{
				    	try   {
							choice = cin.nextInt();
                           break;
						       }
				    	catch (InputMismatchException e) 
				    	{
				            System.out.print("Invalid input. Please reenter: ");
				            cin.nextInt();
				        }
				     }
				//switch-case
						switch (choice)
						{
						case 1:
							Car.run();
						   break;
						case 2:
							Status();
						   break;
						case 3:
							Simulator.ender();
						   break;
						}
							}		
						cin.close();
		}
		Simulator Sim = new Simulator();
		Wheel tire = new Wheel();
		static Car Car = new Car();
		

}
