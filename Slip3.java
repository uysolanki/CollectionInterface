import java.util.*;

public class Slip3
{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		Hashtable ht=new Hashtable();
		int n,i,sal,max,z;
		String ename;
		
		System.out.println("Enter Numbe of Employees");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
		System.out.println("Enter Name of Employee");
		ename=sc.next();
		System.out.println("Enter Sal of Employee");
		sal=sc.nextInt();
		ht.put(ename,sal);
		}
		
		System.out.println(ht);
		max=0;
		
		Enumeration sid=ht.keys();
		
		while(sid.hasMoreElements())
			{
				
				String key=(String) sid.nextElement();
				
				z=Integer.parseInt(ht.get(key).toString());
				
				if(z>max)
					max=z;
					
			}
		
		System.out.println("Max Salary is "+max);
		
		}
}
