    import java.io.*;  
    import java.util.*;  
        
    public class ListIteratorDemoNew {  
        public static void main(String[] args)  
        {  
            ArrayList<String> studs = new ArrayList<String>();  
        
            studs.add("Alice");  
            studs.add("Ben");  
            studs.add("Charles");  
            studs.add("Dom");  
            studs.add("Eric");  
			
            // Iterator to iterate the cityNames  
            ListIterator listit;
			listit = studs.listIterator(); 
			
			
			
			System.out.println("Student Names Forward Order : ");  
			
            while (listit.hasNext())  
            {
				String favstud=(String)listit.next();
				System.out.print(favstud + " ");
			
				if(favstud.equals("Dom"))
				{
					listit.set("Derick");
				}
				
				if(favstud.equals("Charles"))
				{
					listit.remove();
				}
				
				if(favstud.equals("Eric"))
				{
					listit.add("Frank");	
				}
				
			}
			System.out.println();
			
			System.out.println("Student Names Backward Order: ");  
			
            while (listit.hasPrevious())  
            {
			System.out.print(listit.previous() + " "); 
				
			}
			
				
        
            
        }  
    }  