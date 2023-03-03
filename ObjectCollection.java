import java.util.*;

class Account {
	
	int account_number;
	String account_type;
	String name;
	double balance;
	
	
	public void acceptAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number");
		account_number=sc.nextInt();
		System.out.println("Enter Account Type");
		account_type=sc.next();
		System.out.println("Enter Account Name");
		name=sc.next();
		System.out.println("Enter Account Balance");
		balance=sc.nextDouble();
	}
	

	public void displayAccount()
	{
	System.out.println("account number    " +account_number);	
	System.out.println("account type    " +account_type);
	System.out.println("account name     "+name);
	System.out.println("account balance      "+balance);
	}
}


public class ObjectCollection
{	

	public static void main(String[] args) {
		
		ArrayList<Account> accountlist= new ArrayList<Account>();
		Account a1= new Account();
		Account a2= new Account();
		a1.acceptAccount();
		a2.acceptAccount();
		
	    accountlist.add(a1);
	    accountlist.add(a2);
	
		
	    for(int i=0;i<accountlist.size();i++)
		 {   
			  if(accountlist.get(i).balance >=1500)
			  {
	    	  accountlist.get(i).displayAccount();
			  }
	     }
		

	}

}