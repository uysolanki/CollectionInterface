import java.util.*;

public class IteratorDemo
{
	public static void main(String cla[]) 
	{
		ArrayList mylist=new ArrayList();  
		Iterator  myitr;
		mylist.add("Alice");
		mylist.add("Ben");
		mylist.add("Charles");
		mylist.add("Dom");
		mylist.add("Eric");
		mylist.add("Frank");
			
		myitr = mylist.iterator(); 
		
		boolean b=myitr.hasNext(); //check  //Returns true if there are more number of elements.
		System.out.println("Is there any next element? " + b );//true
		
		String a = (String)myitr.next(); //fetch  //Returns the next element.
		//System.out.println("Next Element: " + a); //Alice
		String c = (String)myitr.next(); 
		String d = (String)myitr.next();
		
		
		myitr = mylist.iterator(); 
       
		

		 while(myitr.hasNext())  
		 {  
			System.out.println(myitr.next());  
		 }  
		 
		myitr.remove();  
		System.out.println("After the remove() method is called : "+ mylist); 
		//[Alice,Ben...]
		
	}
}
