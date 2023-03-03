import java.util.*;

public class ArrayListDemo
{
	public static void main(String cla[]) 
	{
		ArrayList nwcc=new ArrayList();   //default capacity = 10
		nwcc.ensureCapacity(50);          //new capacity = 50
		
		nwcc.add("Bramha");
		nwcc.add("Virat");
		nwcc.add("Owais");
		nwcc.add("Zaid");
		nwcc.add("Esha");
		nwcc.add("Fares");
		nwcc.add("Zaid");
		
		System.out.println(nwcc.indexOf("Zaid"));  //first occurance//3
		
		if(nwcc.contains("Bramha"))
		{
				System.out.println("Object Exists");
		}
		
		String aurangabad=(String)(nwcc.remove(5));
		System.out.println(aurangabad);  //Fares
		
		System.out.println(nwcc.get(2));
		System.out.println(nwcc);  //[aaa,bbb,ccc,ddd] 
		System.out.println(nwcc.size()); 
		
		System.out.println(nwcc);  
		
		ArrayList miras=new ArrayList(65);
		miras.add("Isha");
		miras.add("Seema");
		
		nwcc.addAll(miras);
		
		System.out.println(nwcc);   
		System.out.println(nwcc.size()); //6
		
		LinkedList l1=new LinkedList();
		l1.add("AAA");
		l1.add("BBB");
		
		ArrayList demo=new ArrayList(l1);
		System.out.println(demo);
		
		
		
		
	}
}
