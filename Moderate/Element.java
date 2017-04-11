package Moderate;

import java.util.ArrayList;

public class Element {

	String tag;
	String value;
	ArrayList<Attribute> attribute=new ArrayList<Attribute>();
	ArrayList<Element> element=new ArrayList<Element>();
	public Element(String tag)
	{
		this.tag=tag;
	
	}
	
	public Element(String tag,String value)
	{
		this.tag=tag;
		this.value=value;
	}
	
	int getNameCode(String name)
	{
		if(name=="family")
			return 1;
		else if(name=="person")
			return 2;
		return 0;
		
		
	}
	void insert(Attribute attr)
	{
		attribute.add(attr);
	}
	void insert(Element ele)
	{
		element.add(ele);
	}
	
	
}
