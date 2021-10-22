package project2;
import java.util.HashMap;
import java.util.Map;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Mango");
		map.put(2, "orange");
		map.put(3, "Bananna");
		map.put(4, "Fruits");
		System.out.println("Iterating Hashmap...");
		for(Map.Entry m:map.entrySet())
				{
			System.out.println(m.getKey()+" "+m.getValue());
				}
		

	}

}
