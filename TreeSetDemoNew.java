import java.util.*;

public class TreeSetDemoNew
{
	public static void main(String cla[]) 
	{
		TreeSet myhash=new TreeSet();  
		
		myhash.add("Dom");
		myhash.add("Alice");
		myhash.add("Ben");
		myhash.add("Frank");
		myhash.add("Charles");
		
		myhash.add("Alice"); //will this be added? NO
		
		//myhash.add(null);	//yes 1 null allowed
		//myhash.add(null);   //NO
		
		
		System.out.println(myhash);  //random order 
		
		if(myhash.contains("Bramha"))
		{
				System.out.println("Object Exists");
		}
		else
		
		{
				System.out.println("Object NOT Exists");
		}
		
		
	}
}
