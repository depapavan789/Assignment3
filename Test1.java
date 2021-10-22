package project2;
import java.util.*;
import java.util.PriorityQueue;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
queue.add(3);
queue.add(10);
queue.add(20);
queue.add(30);
queue.add(19);
queue.add(8);
System.out.println("elements in a Queue:"+queue);
Iterator itr=queue.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
queue.peek();
System.out.println("after removing elements:"+queue);
queue.poll();
System.out.println("after removing elemnts:"+queue);


	}

}
