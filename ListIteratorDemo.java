import java.util.*;

public class ListIteratorDemo
{
	public static void main(String cla[]) 
	{
		ArrayList mylist=new ArrayList();  
		ListIterator mylistitr;
		mylist.add("Alice"); //0
		mylist.add("Ben");  //1
		mylist.add("Charles"); //2
		mylist.add("Dom");	//3
		mylist.add("Eric");		//4
		mylist.add("Frank");	//5
			
		mylistitr = mylist.listIterator(2); //index from where to start iteration 
														 //NoSuchElementException	
		
		boolean b=mylistitr.hasNext();
		System.out.println("Is there any next element? " + b );//true
		
		String a = (String)mylistitr.next();  
        System.out.println("Next Element: " + a);	//Charles
		
		int index1 = mylistitr.nextIndex();
        System.out.println("Position of Next Element: " + index1);	//3
		
		
		
        mylistitr = mylist.listIterator();
		
		System.out.println("FORWARD TRAVERSAL");
		while (mylistitr.hasNext())  
			{  
			System.out.println(mylistitr.next());
			}  //Alice Ben Charles Dom Eric Frank
		 
		 
		System.out.println("BACKWARD TRAVERSAL");
		while (mylistitr.hasPrevious())  
			{  
			System.out.println(mylistitr.previous());
			} 
			
		mylistitr.set("Joe");  //replace
		mylistitr.remove();  
		System.out.println("After the remove() method is called : "+mylist); 
		
	}
}
