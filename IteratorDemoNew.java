    import java.io.*;  
    import java.util.*;  
        
    public class IteratorDemoNew {  
        public static void main(String[] args)  
        {  
            ArrayList<String> cities = new ArrayList<String>();  
        
            cities.add("Alice");  
            cities.add("Ben");  
            cities.add("Charles");  
            cities.add("Dom");  
            cities.add("Eric");  
			
            // Iterator to iterate the cityNames  
            Iterator iterator;
			iterator = cities.iterator();  
			
			System.out.println("CityNames Names before  deletion elements : ");  
			
            while (iterator.hasNext())  
            {
			System.out.print(iterator.next() + " "); 
			iterator.remove();
			}
			
			int k=0;
			iterator = cities.iterator();
			System.out.println("CityNames Names After  deletion elements : ");
			while (iterator.hasNext())  
            {
				k++;
			System.out.print(iterator.next() + " "); 
			iterator.remove();
			}
			 System.out.println(k);
				
        
            
        }  
    }  