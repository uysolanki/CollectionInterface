import java.util.*;

public class CollectionDemo
{
	public static void main(String args[])
	{
	
	ArrayList ness=new ArrayList();
	ness.add("Nazish");
	ness.add("Neha");
	
	
	
	ArrayList miras=new ArrayList();
	miras.add("Isha");
	miras.add("Saniya");
	
	ArrayList enumtech=new ArrayList();
	enumtech.addAll(ness);
	enumtech.addAll(miras);
	
	miras.add("Alisha");
	
	if(enumtech.containsAll(miras))
	{
		System.out.println("All Miras are in Enumtech");
	}
		else
	{
		System.out.println("Few Miras are in Enumtech");
	}
			
	
	
	System.out.println(enumtech);
	}
}