import java.util.*;
public class MapDemo
{
	public static void main(String args[])
	{
		/*HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(101,"Alice");
		map1.put(103,"Charles");
		map1.put(105,"Elcid");
		map1.put(106,"Frank");
		map1.put(104,"Dom");
		map1.put(102,"Ben");
		
		System.out.println(map1);
		
		LinkedHashMap<Integer,String> map2=new LinkedHashMap<>();
		map2.put(101,"Alice");
		map2.put(103,"Charles");
		map2.put(105,"Elcid");
		map2.put(106,"Frank");
		map2.put(104,"Dom");
		map2.put(102,"Ben");
		
		System.out.println(map2);*/
		
		TreeMap<Integer,String> map3=new TreeMap<Integer,String>(Collections.reverseOrder());
		map3.put(101,"Alice");
		map3.put(103,"Charles");
		map3.put(105,"Elcid");
		map3.put(106,"Frank");
		map3.put(104,"Dom");
		map3.put(102,"Ben");
		
		System.out.println(map3);
		
	}
}