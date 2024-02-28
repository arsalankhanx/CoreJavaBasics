package InheritanceExamples;

public class Bicycle {
	int gear;
	int cadence;
	int speed;
	
	public Bicycle(int startGear,int startCadence,int startSpeed) 
	{
	  gear=startGear;
	  cadence = startCadence;
	  speed=startSpeed;
	  
	}
	 void setCadence(int newValue)
	 {
		 cadence=newValue;
	 }
     void setGear(int newValue)
     {
    	 gear=newValue;
     }
     
     void applyBreak(int decrement)
     {
    	 speed-=decrement;
    	 System.out.println("Speed decrement"+speed);
     }
     void speedUp(int increment)
     {
    	 speed+=increment;
    	 System.out.println("Speed up"+speed);
     }
}
