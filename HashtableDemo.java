import java.util.*;


class HashtableDemo
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		
			System.out.print("Enter no of Records:");
			int n=sc.nextInt(); //20
		
			Hashtable hashtable=new Hashtable(n);//2nd constructor , LF = 0.75
			String name="";  //key
			float sal;		 //value
			for(int i=1; i<=n; i++)
			{
				System.out.println("Enter the name of Employee :"+i+":");
				name=sc.next();
				
				System.out.println("Enter sal of Employee:"+ i +":");
				sal=sc.nextFloat();
				hashtable.put(name,sal);	//add to Hashtable
			}
			System.out.println(hashtable);//{Alice=800,Ben=900,Charles=1000}
			hashtable.remove("Ben");    //remove(key)
			System.out.println(hashtable);
			System.out.println(hashtable.get("Alice"));  //fetch get(key)
}
}
