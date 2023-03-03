import java.util.*;

public class HashSetDemo
{
	public static void main(String cla[]) 
	{
		HashSet myhash=new HashSet();  
		
		myhash.add("Alice");
		myhash.add("Ben");
		myhash.add("Charles");
		myhash.add("Dom");
		myhash.add("Alice"); //will this be added? NO
		myhash.add("Frank");
		myhash.add(null);	//yes 1 null allowed
		myhash.add(null);   //NO
		
		
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
