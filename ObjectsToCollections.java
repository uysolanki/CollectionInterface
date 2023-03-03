import java.util.ArrayList; 
class Account 
{ 
	int acno;
	String actypye; 
    
   


  Account(int a, String b)
   { 
     acno = a; 
     actypye = b; 
   }
	
   void display()
   {
   System.out.println(acno+actypye); 
   } 
}

public class ObjectsToCollections 
{ 
	public static void main(String args[])
	{
	ArrayList<Account> Accountlist = new ArrayList<Account>();
  
	
    Account a1 = new Account(1,"Vishwa"); 
    Account a2 = new Account(2,"Prajwal"); 
    Account a3 = new Account(3,"Shubham"); 

     Accountlist.add(a1); 
     Accountlist.add(a2); 
     Accountlist.add(a3);  
	 
	 for(int i=0;i<Accountlist.size();i++)
	 {
	 Accountlist.get(i).display();
	 } 
	}
}