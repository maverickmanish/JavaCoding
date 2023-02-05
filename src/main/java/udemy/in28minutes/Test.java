
package udemy.in28minutes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*Annotation:-


@Dependson : creational dependency A -> B 
@beanFactoryPostProcessor : IOC level configuration change before actual instantiation.
Bean A, based on condition at runtime 
Customization of IOC in spring : AwareInjection, NestedBeanFactory  (Parent & Child can
access parent things .. cross bean definition accessibility )

Service layer has to be independent ... Parent

Filters in springBoot 

JPA Exception :  
*/

public class Test {

	public static boolean isPrime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==2)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		System.out.println(isPrime(8));
		String name = "Ankur Shannsnnsrmsasss";
		
		List<Integer> list= new ArrayList<>();
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(10);
		list.add(10);
		list.add(2);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(22);
		list.add(1);
		
		Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		collect.entrySet().stream().filter(e-> e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList()).
		forEach(System.out::println);
		
		
		System.out.println(list.stream().filter(e->e%2==0).reduce(Integer::sum).get());
	//	System.out.println(indexOfMostRepeatedChar(name.toLowerCase()));

		 Map<String, String> hashMap = new HashMap<>();
		 
	        hashMap.put("RED", "#FF0000");
	        hashMap.put("BLACK", null);
	        hashMap.put("BLUE", "#0000FF");
	        hashMap.put("GREEN", "#008000");
	        hashMap.put("WHITE", null);
//	 1.
	        // using Map.values() + removeIf()
	        hashMap.values().removeIf(Objects::isNull);
	 

	     // using lambda expression
	        hashMap.values().removeIf(x -> !Objects.nonNull(x));
	     // using Map.entrySet() + removeIf()
	        hashMap.entrySet().removeIf(entry -> entry.getValue() == null);
	     // using Map.keySet() + removeIf()
	        hashMap.keySet().removeIf(key -> hashMap.get(key) == null);
	     
	        //2.using java 8 
	         hashMap.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() != null)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));        
	        
//3. Handle null map
//All the above codes will throw a NullPointerException if the map is null.
//We can avoid that by creating an empty map if the map is null using Optional.ofNullable(),
//as shown below:
	         
	         Map<String, String> hashMapNullable = null;
	         List<String> adminUserRole = List.of("manish","kumar");
	         
	         List<String> collect3 = Optional.ofNullable(adminUserRole).orElse(List.of()).stream()
	                 .map(privilege -> privilege.toString()).collect(Collectors.toList());
	         
	         
	         List<String> collect4 = Optional.ofNullable(adminUserRole).orElseGet(List::of).stream()
	                 .map(privilege -> privilege.toString()).collect(Collectors.toList());
	         
			List<String> collect2 = Optional.ofNullable(adminUserRole).orElseGet(Collections::emptyList).stream()
             .map(privilege -> privilege.toString()).collect(Collectors.toList());
	         
			System.out.println("list is "+collect2);
	         hashMapNullable = Optional.ofNullable(hashMapNullable)
	                         .orElseGet(Collections::emptyMap)
	                         .entrySet().stream()
	                         .filter(entry -> entry.getValue() != null)
	                         .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	         
	        System.out.println("see the nullable HashMap"+hashMap);
	        
	        
	        String[] s = new String[]{ "sort", "string", "array" };
	        Collections.sort(Arrays.asList(s));
	        
	        System.out.println(Arrays.toString(s));
		
	}

	public static int indexOfMostRepeatedChar(String s) {
		int count = -1;
		int index = -1;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
			int valueCount = map.get(c);
			if (valueCount > count) {
				count = valueCount;
				index = i;
			}
		}
		return index;
	}
}
