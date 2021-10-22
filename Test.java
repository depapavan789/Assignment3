package project2;
import java.util.ArrayList;
import java.util.Iterator;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(5);
		numbers.add(8);
		numbers.add(28);
		numbers.add(23);
		Iterator<Integer>it=numbers.iterator();
		while(it.hasNext())
		{
			Integer i=it.next();
			if(i<10)
			{
				it.remove();
				
			}
		}
System.out.println(numbers);
	}

}
