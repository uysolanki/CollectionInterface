import java.util.*;

public class EnumerationDemo
{
	public static void main(String cla[]) 
	{
		Vector myvec=new Vector();  
		Enumeration employees;
		
		myvec.add("Alice");
		myvec.add("Ben");
		myvec.add("Charles");
		myvec.add("Dom");
		myvec.add("Eric");
		myvec.add("Frank");
			
		employees = myvec.elements();
		
		while (employees.hasMoreElements())
		{
         System.out.println(employees.nextElement()); //Alice Ben Charles Dom Eric Frank 
		}
	}
}