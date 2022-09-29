package labproject3.probs1;

public class Microwave {
	
		//Instance Variables go here
	
		private int time = 0;
		private int power = 0;
		//Constructor goes here
	
		public Microwave()
		{
		time = 0;
		power = 1;
		}
	
		//timeButton method goes here
	
		public void timeButton() 
		{
		time = time + 30;
		}
	
		//powerButton method goes here
	
		public void powerButton() 
		{
		if(power == 1)
		{
		power = 2;	
		}
		else 
		{
		power = 1;
		}
		}
	
		//resetButton method goes here
	
		public void resetButton() 
		{
		time = 0;
		power = 1;
		}
	
		//startButton method goes here
	
		public void startButton()
		{
		System.out.println("Cooking for " + time + " seconds at level 1 " + ".");
	}
}
