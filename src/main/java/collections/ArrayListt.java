package collections;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		for(int i=0;i<10;i++)
		arrList.add(i++);
	    arrList.forEach(item -> System.out.printf("%d, ", item)); //  arrList -->[0,2,4,6,8]
	 
		for(int i=1;i<11;i++)
			arrList.add(i, i++);
		System.out.printf("\n %s \n", arrList);  //  arrList -->[0,1,2,3,4,5,6,7,8,9]
		
		ArrayList<Integer> arrList2 = new ArrayList<>();
		arrList2.add(456);
		System.out.println(arrList2); // arrList2 -->[456]
		
/*      ⚠️ addAll(Collection)
		Appends all elements of arrList
		Order is preserved*/
		arrList2.addAll(arrList);
		System.out.println(arrList2); // arrList2 -->[456,0,1,2,3,4,5,6,7,8,9]
		
		arrList2.add(543);
		System.out.println(arrList2); // arrList2 -->[456,0,1,2,3,4,5,6,7,8,9,543]
		
/*		Inserts arrList at the end
		Same as addAll(arrList)*/
		arrList2.addAll(arrList2.size(), arrList);
		
		System.out.println(arrList2); // arrList2 -->[456,0,1,2,3,4,5,6,7,8,9,543,0,1,2,3,4,5,6,7,8,9]
		
		System.out.println(arrList.size()); // size =10
		System.out.println("***************Iterator Concept **********");
/*		🔁 Iterator Traversal
		Why iterator?
		Safe traversal
		Needed when removing elements during iteration
⚠️ Removing via arrList.remove() here would throw ConcurrentModificationException
		🔴 Iterator – Fail-Fast*/
		Iterator<Integer> itr= arrList.iterator();
		while(itr.hasNext())
		{
			arrList.remove("B"); // ❌ illegal throws ConcurrentModificationException
			itr.remove(); // ✅ safe removal
			System.out.printf("%d, ", itr.next());
		}
//		🔴 Iterator – Fail-Safe (Concurrent Collections)
		List<String> list = new CopyOnWriteArrayList<>(List.of("A", "B", "C"));
		Iterator<String> itrSafe = list.iterator();
		
		while (itrSafe.hasNext()) {
			String val = itrSafe.next();
			list.add("X");  // ✔ allowed
		}
		System.out.println(list);
		
/*		📎 subList()
		Important facts:
		subList(from, to) → from inclusive, to exclusive
		It is a view, not a copy
		⚠️ Changes in arrList3 affect arrList*/
		System.out.println("\n subList() usage ");
		List<Integer> arrList3=  arrList.subList(3, 5);
		System.out.println(arrList3);
		
		List<Integer> mainList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		List<Integer> subList = mainList.subList(1, 4);
		subList.set(1, 999);
		System.out.println("Main List : " + mainList);
		System.out.println("Sub List  : " + subList);
		mainList.add(100);  // structural change
/*		🧠 Reason
		subList tracks modification count (modCount)
				Parent structure changed → view invalidated*/
		System.out.println("Sub List  : " + subList); // This line will throw Runtime Exception :: ConcurrentModificationException
		List<Integer> safeCopy = new ArrayList<>(mainList.subList(1, 4));
		
		System.out.println("remove() usage ");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("java");
		list1.add("c++");
		list1.add("python");
		list1.add("c");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("c++");
		list2.add("c++");
		
		System.out.println("\n List before removing elements");
		System.out.printf("\n list1: %s  \n list2: %s", list1, list2);
		
		list1.removeAll(list2);
		System.out.println("List after removing elements from list2");
		System.out.println(list1);
	}
}
