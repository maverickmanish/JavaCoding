package collections;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListt {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		for(int i=0;i<10;i++)
		arrList.add(i++);
	 arrList.forEach(System.out::println);
		for(int i=1;i<11;i++)
			arrList.add(i,i++);
		System.out.println(arrList);
		ArrayList<Integer> arrList2 = new ArrayList<>();
		arrList2.add(456);
		System.out.println(arrList2);
		arrList2.addAll(arrList);
		System.out.println(arrList2);
		arrList2.add(543);
		System.out.println(arrList2);
		arrList2.addAll(arrList2.size(),arrList);
		System.out.println(arrList2);
		System.out.println(arrList.size());
		System.out.println("iterator way ... !!!");
		
		
		Iterator<Integer> itr= arrList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		System.out.println(" Now, sub list show ");
		
		List<Integer> arrList3=  arrList.subList(3, 5);
		System.out.println(arrList3.toString());
		System.out.println(" Now, remove show ");
		
		ArrayList<String> list1 = new ArrayList<String>();
	    list1.add("java");
	list1.add("c++");
	list1.add("python");
	list1.add("c");
	ArrayList<String> list2 = new ArrayList<String>();
	list2.add("c++");
	list2.add("c++");
	System.out.println("List before removing elements");
	System.out.println(list1);
	list1.removeAll(list2);
	System.out.println("List after removing elements");
	System.out.println(list1);
	}
}
