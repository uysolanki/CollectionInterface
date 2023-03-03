import java.util.*;

public class VectorDemo
{
	public static void main(String cla[]) 
	{
		/*Vector myvec=new Vector();
		System.out.println(myvec.capacity());
		
		Vector myvec1=new Vector(25);  //default capacity=10
		System.out.println(myvec1.capacity());
		
		Vector myvec2=new Vector(25,5);  //default capacity=10
		System.out.println(myvec2.capacity());*/
		
		Vector myvec=new Vector(5,15);  //default capacity=10
		System.out.println(myvec.capacity()); //5
		
		myvec.add("Bramha");
		myvec.add("Zaid");
		myvec.add("Virat");
		myvec.addElement("Owais");
		System.out.println(myvec.capacity());  //5
		System.out.println(myvec.size());	   //4
		myvec.addElement("Zaid");
		myvec.addElement("Frank");
		
		System.out.println(myvec.capacity());	//20
		System.out.println(myvec.size());		//6
		
		System.out.println(myvec);
		
		if(myvec.contains("bramha"))
		{
				System.out.println("Object Exists");
		}
		else
		
		{
				System.out.println("Object NOT Exists");
		}
		
		
		System.out.println(myvec.get(2));
		System.out.println(myvec.elementAt(2));
		
		System.out.println(myvec.firstElement());
		System.out.println(myvec.lastElement());
		  
		//System.out.println(myvec.size()); 
		//System.out.println(myvec.capacity()); 
	
		myvec.removeElementAt(2);
		myvec.insertElementAt("Alice", 2);  
		
		System.out.println(myvec);
		
	}
}
