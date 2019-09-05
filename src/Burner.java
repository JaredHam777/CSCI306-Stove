/**
 * Burner class. 
 *  
 * @author Jared Hamilton
 * @author Mitch Cutts
 * 
 * C06A Stove Exercise
 */


public class Burner {

	//Different temperature levels
	public enum Temperature	{
		COLD("cooool"), WARM("warm"), HOT("CAREFUL"), BLAZING("VERY HOT! DON'T TOUCH");
		Temperature(String _value)	{
			value = _value;
		}
		private String value;
		public String toString()	{
			return value;
		}
	}

	private Temperature myTemperature;

	//Getter for temperature enumerated type and variable
	public Temperature getMyTemperature() {
		return myTemperature;
	}

	//Increments temperature enumeration ordinal location according the amount parameter
	public void changeTemperature(int amount) {
		try {
			myTemperature = myTemperature.values()[myTemperature.ordinal()+amount];
		} catch (Exception e) {}
	}

	//Setting instance for this burner
	public Setting mySetting;

	//number of simulated minutes for a temperature enumeration to increase/decrease
	public static final int TIME_DURATION=2;

	//current time left for this burner to change its temperature enumeration location
	private int timer=TIME_DURATION;


	//raises the mySetting enumeration one level, exception catches it if setting cannot increase beyond current location
	public void plusButton()	{
		try {
			mySetting = mySetting.values()[mySetting.ordinal()+1];
		} catch (Exception e) {}

	}

	//lowers the mySetting enumeration one level, exception catches it if setting cannot decrease beyond current location
	public void minusButton()	{
		try {
			mySetting = mySetting.values()[mySetting.ordinal()-1];
		} catch (Exception e) {}
	}

	//Called every minute, increments and/or resets timer
	public void updateTemperature()	{

		//if there is a difference between current temp and setting temp:
		if(this.mySetting.ordinal()!=this.myTemperature.ordinal())
		{
			timer--;	//timer will never equal zero before decrement 

			//direction, either 1 or -1 specifies the direction of increasing/decreasing temperature to its destination setting
			int direction = 1;
			if(this.mySetting.ordinal() < this.myTemperature.ordinal())	{
				direction = -1;
			}			

			//if timer is 0, time to increment temperature enumeration in specified direction, and reset timer to its max
			if(timer==0)	{
				this.changeTemperature(direction);
				timer=TIME_DURATION;
			}

		}

	}

	public void display()
	{
		System.out.println("["+this.mySetting.toString()+"]....."+this.getMyTemperature().toString());
	}


	public Burner()	{
		this.mySetting = Setting.OFF;
		this.myTemperature = Temperature.COLD;
	}

}
