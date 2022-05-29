 package y2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Map<String,Integer> map = new HashMap<>();
				 map.put("manish", 111);
				 map.put("ramesh", 222);
				 map.put("rakesh", 333);
				 System.out.println(map.putIfAbsent("rajesh", 444));
				 
				 map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				 .collect(Collectors.toList()).forEach(System.out::println);
				 
				 List<String> list= new ArrayList<>();
				 list.add("Audi");
				 list.add("Ford");
				 list.add("Audi");
				 list.add("Maruti");
				 list.add("Innova");
				 list.add("Chervolate");
				 
				 int no = list.stream().collect(Collectors.toMap (Function.identity(), String::length, (e1,e2)->e2)).entrySet().size();
				 System.out.println(no);
				 System.out.println(list.stream().collect(Collectors.toMap (Function.identity(), String::length, (e1,e2)->e2)));
				 
				 
	}

}
