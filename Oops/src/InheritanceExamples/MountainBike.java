package InheritanceExamples;

public class MountainBike extends Bicycle {
	
	int setHeight;
	
	public MountainBike(int startHeight,int startGear,int startCadence,int startSpeed)
	{
		super(startGear,startCadence,startSpeed);
		setHeight=startHeight;
	}
	
	void setHeight(int newValue)
	{
		setHeight=newValue;
	}
    
	
	 public static void main (String args[])
	 {
		 MountainBike mb = new MountainBike(50,2,11,40);
		 
		 mb.applyBreak(20);
		 mb.speedUp(30);
	 }
}
