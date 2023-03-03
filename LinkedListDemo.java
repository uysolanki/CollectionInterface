import java.util.*;

public class LinkedListDemo
{
	public static void main(String cla[]) 
	{
		LinkedList mylist=new LinkedList();  
		
		mylist.add("Bramha");
		mylist.add("Zaid");
		mylist.add("Virat");
		mylist.add("Owais");
		mylist.add("Zaid");
		
		
		System.out.println(mylist); //[Bramha,Zaid,Virat,Owais,Zaid]
		
		if(mylist.contains("Bramha"))
		{
				System.out.println("Object Exists");//Object Exists
		}
		else
		
		{
				System.out.println("Object NOT Exists");
		}
		
		
		System.out.println(mylist.get(2)); //Virat
	
		  
		System.out.println(mylist.size()); //5
		
		mylist.addFirst("Alice");
		System.out.println(mylist);//[Alice,Bramha,Zaid,Virat,Owais,Zaid]
		
		mylist.addLast("Tom");
		System.out.println(mylist);//[Alice,Bramha,Zaid,Virat,Owais,Zaid,Tom]
		
		System.out.println(mylist.get(2));//Zaid
		
		System.out.println(mylist.peekFirst()); //Alice,khud bhi rakh aur mujhe bhi de & give 
		System.out.println(mylist);//[Alice,Bramha,Zaid,Virat,Owais,Zaid,Tom]
		
		System.out.println(mylist.pollFirst());//Alice, give me and you dont keep
		System.out.println(mylist);//[Bramha,Zaid,Virat,Owais,Zaid,Tom]
		
		System.out.println(mylist.indexOf("Zaid")); //1
		System.out.println(mylist.lastIndexOf("Zaid"));//4
		
		
	}
}
