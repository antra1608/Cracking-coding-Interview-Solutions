package Moderate;

public class Attribute {

	String tag;
	String value;
	public Attribute(String tag,String value)
	{
		this.tag=tag;
		this.value=value;
	}
	
	
	int getTagCode(String name)
	{
		if(name=="lastname")
			return 4;
		else if(name=="state")
			return 5;
		else if(name=="firstname")
			return 3;
		
		return 0;			
		
		
	}
	
	
}
