package project2;
import java.util.LinkedList;
public class Collection2 {

	public static void main(String[] args) {
		LinkedList<String>l1=new LinkedList<String>();
		System.out.println("intial list of elements:"+l1);
		l1.add("Ravi");
		l1.add("pavan");
		l1.add("kumar");
		l1.add("Ajay");
		System.out.println("After Adding elements:"+l1);
		l1.add(1,"Gaurav");
		System.out.println("After Adding elements:"+l1);
		l1.remove(0);
		System.out.println("Removing the index value Zero:"+l1);
			}

}
