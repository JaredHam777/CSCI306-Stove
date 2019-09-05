


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

	


