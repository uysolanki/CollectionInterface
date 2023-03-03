import java.util.*;


public class HashMapDemo
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		
			System.out.print("Enter no of Records:");
			int n=sc.nextInt(); //20
		
			HashMap<String,Integer> hm=new HashMap<String,Integer>(n);//2nd constructor , LF = 0.75
			String name="";  //key
			int sal;		 //value
			/*for(int i=1; i<=n; i++)
			{
				System.out.println("Enter the name of Employee :"+i+":");
				name=sc.next();
				
				System.out.println("Enter sal of Employee:"+ i +":");
				sal=Integer.parseInt(sc.next());
				hm.put(name,sal);	//add to HashMap
			}*/
			hm.put(null,3333);
			hm.put("Ben",null);
			hm.put("Charles",null);
			hm.put(null,7777);
			hm.put("Zubiyan",null);
			hm.put("Yash",1200);
			
			System.out.println(hm);//{Alice=800,Ben=900,Charles=1000}
			hm.remove("Ben");    //remove(key)
			System.out.println(hm);
			System.out.println(hm.get("Alice"));  //fetch get(key)
}
}
