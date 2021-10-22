package project2;
import java.util.*;
import java.util.ArrayList;
public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
		list.add("Mango");
		list.add("Bananna");
		list.add("Pineapple");
		list.add("Graphes");
		list.remove("Mango");
		for(String n:list)
		{
			System.out.println(n);
		}
			

	}

}
