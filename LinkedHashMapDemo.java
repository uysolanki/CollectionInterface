import java.util.*;


public class LinkedHashMapDemo
{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String args[])
	{
		
			//.out.print("Enter no of Records:");
			//int n=sc.nextInt(); //20
		
			LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();//2nd constructor , LF = 0.75
			String name="";  //key
			int sal;		 //value
			/*for(int i=1; i<=n; i++)
			{
				System.out.println("Enter the name of Employee :"+i+":");
				name=sc.next();
				
				System.out.println("Enter sal of Employee:"+ i +":");
				sal=Integer.parseInt(sc.next());
				lhm.put(name,sal);	//add to LinkedHaslhmap
			}*/
			lhm.put("Alice",3333);
			lhm.put("Ben",null);
			lhm.put("Charles",null);
			lhm.put("Dom",7777);
			lhm.put("Elcid",null);
			lhm.put("Frank",1200);
			
			System.out.println(lhm);//{Alice=800,Ben=900,Charles=1000}
			lhm.remove("Ben");    //remove(key)
			System.out.println(lhm);
			System.out.println(lhm.get("Alice"));  //fetch get(key)
}
}
