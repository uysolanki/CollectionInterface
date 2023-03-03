import java.util.*;

public class TreeSetDemo
{
	public static void main(String cla[]) 
	{
		TreeSet mytree=new TreeSet();  
		
		mytree.add("Frank");
		mytree.add("Ben");
		mytree.add("Alice");
		mytree.add("Dom");
		mytree.add("Zaid");
		mytree.add("Frank");
			
		System.out.println(mytree);
		
		System.out.println(mytree.first());
		System.out.println(mytree.last());
		
		System.out.println(mytree.higher("Eric"));
		System.out.println(mytree.lower("Eric"));
		
	}
}
