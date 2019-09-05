
public class Burner {

	public enum Temperature	{
		BLAZING, HOT, WARM, COLD
	}
	Temperature myTemperature;
	private Temperature getMyTemperature() {
		return myTemperature;
	}


	public Setting mySetting;
	private int timer;
	public static final int TIME_DURATION=2;
	
	
	public void plusButton()	{
		try {
		mySetting = mySetting.values()[mySetting.ordinal()+1];
		} catch	(Exception e){
			mySetting = mySetting.valueOf("HIGH");
		}
		System.out.println(mySetting.ordinal());
	}
	
	public void minusButton()	{
		
	}
	
	public void updateTemperature()	{
		
	}
	
	
	public Burner()	{
		super();
		this.mySetting = Setting.valueOf("OFF");

	}
	
}
