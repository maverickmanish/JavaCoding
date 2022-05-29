package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionRotation {

	public static void main(String[] args) {
		
		List<Integer> arraylist = Arrays.asList(new Integer[] {1,2,3,4,5});
		ListRotation(arraylist,3);
		
		Integer[] array= new Integer[] {2,3,4,6,7};
		ArrayRotation(array,3);
		
		for (Integer integer : array) {
			System.out.println(integer);
		}
		
		Integer[] array1= new Integer[] {1,2,3,4,5};
		Integer[] array2 =new Integer[] {4,5,1,2,3};
		
		System.out.println(isRotation(array2,array1)); 
		
		
		
	}
	
	public static boolean isRotation(Integer[] a,Integer[] array2)
	{
		if(a.length!=array2.length)
			return false;
		int i=0;
		for(;i<array2.length;i++)
		{
			if(a[0]==array2[i])
				break;
		}
		
		if(i==array2.length)
			return false;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=array2[(j+i)%a.length])
				return false;
		}
		return true;
		
	}

	public static void ListRotation(List<Integer> arraylist, int n) {
		
		Collections.rotate(arraylist, n);
		arraylist.forEach((e)-> {
			System.out.println(" "+e.toString());
		});
	}

	public static void ArrayRotation(Integer[] array, int n) {
		if(n==0)
			return;
		int first=array[0];
		int i=1;
		for (; i<array.length;i++) {
			array[i-1]=array[i];
		}
		array[i-1]=first;
		ArrayRotation(array, --n);
		
	}

}
