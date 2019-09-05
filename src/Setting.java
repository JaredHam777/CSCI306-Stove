/**
 * Setting class. 
 *  
 * @author Jared Hamilton
 * @author Mitch Cutts
 * 
 * C06A Stove Exercise
 */


//4 settings as shown below, in an enumerated type
public enum	Setting {
	OFF ("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");
	private String value;
	Setting(String _value)	{
		value = _value;

	}

	public String toString()	{
		return value;
	}


}




