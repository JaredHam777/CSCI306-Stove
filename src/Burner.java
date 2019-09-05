/**
 * Burner class. 
 *  
 * @author Jared Hamilton
 *
 * 
 * C06A Stove Exercise
 */


public class Burner {

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
	public Temperature getMyTemperature() {
		return myTemperature;
	}
	public void changeTemperature(int amount) {
		try {
		myTemperature = myTemperature.values()[myTemperature.ordinal()+amount];
		} catch (Exception e) {}
	}


	public Setting mySetting;
	public static final int TIME_DURATION=2;
	private int timer=TIME_DURATION;
	
	
	public void plusButton()	{
		try {
		mySetting = mySetting.values()[mySetting.ordinal()+1];
		} catch (Exception e) {}
		
	}
	
	public void minusButton()	{
		try {
		mySetting = mySetting.values()[mySetting.ordinal()-1];
		} catch (Exception e) {}
	}
	
	public void updateTemperature()	{
		
		//if there is a difference between current temp and setting temp:
		if(this.mySetting.ordinal()!=this.myTemperature.ordinal())
		{
			timer--;
			int direction = 1;
			if(this.mySetting.ordinal() < this.myTemperature.ordinal())	{
				direction = -1;
			}			
			
			
			if(timer==0)	{
				this.changeTemperature(direction);
				timer=TIME_DURATION;
			}
			
		}
		else	{
			
		}
	}
	
	
	public Burner()	{
		super();
		this.mySetting = Setting.valueOf("OFF");
		this.myTemperature = Temperature.COLD;

	}
	
}
