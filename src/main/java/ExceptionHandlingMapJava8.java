import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ExceptionHandlingMapJava8 {


	
	void n() {

		System.out.println("n  method ");
		
	}

	public Map<String, String> mapBully(Map<String, String> map) {
		String a = "";
		if (map.containsKey("a")) {
			a = map.get("a");
			map.put("a", "");
			map.put("b", a);
		}
		return map;

	}

	public String[] listToArrayOfString(List<String> list) {
		return (String[]) list.toArray();
	}

	public Map<String, String> mapShare(Map<String, String> map) {

		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		if (map.containsKey("c")) {
			map.remove("c");
		}
		return map;

	}

	public Map<String, String> mapAB(Map<String, String> map) {

		if (map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}

		return map;

	}

	public Map<String, String> topping11(Map<String, String> map) {
		map.put("bread", "butter");
		if (map.containsKey("ice cream"))
			map.put("ice cream", "cherry");
		return map;
	}

	public Map<String, String> topping1(Map<String, String> map) {

		if (map.containsKey("ice cream")) {
			map.put("yogurt", map.get("ice cream"));

		}
		if (map.containsKey("spinach")) {
			map.put("spinach", "nuts");

		}
		return map;

	}

	public Map<String, String> topping2(Map<String, String> map) {
		if (map.containsKey("ice cream"))
			map.put("yogurt", map.get("ice cream"));
		if (map.containsKey("spinach"))
			map.put("spinach", "nuts");
		return map;

	}

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		for (String string : strings) {
			map.put(string, 0);
		}
		return map;

	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		for (String string : strings)
			map.put(string, string.length());

		return map;
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();
		for (String string : strings) {
			map.put(string.substring(0, 1), string.substring(string.length() - 1, string.length()));
		}
		return map;
	}

	public void retur_Map() {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Manish", 7591);
		map.clear();

	}

	public void return_Map() {

	}
/*
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		if (strings.length == 0)
			return map;
		map.put(strings[0], 0);
		for (String string : strings) {
			if (map.containsKey(string))
				map.put(string, map.get(string) + 1);
			else
				map.put(string, 1);
		}
		return map;
	}
*/
	

	public String wordAppend(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		String result = "";
		for (String string : strings) {
			if (map.containsKey(string)) {
				map.put(string, map.get(string) + 1);

			} else
				map.put(string, 1);
			if (map.get(string) % 2 == 0)
				result += string;

		}
		return result;
	}

/*	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map = new HashMap<>();
		for (String string : strings) {
			if (map.containsKey(string))
				map.put(string, true);
			else
				map.put(string, false);
		}
		return map;
	}
*/


	public Map<String, String> topping3(Map<String, String> map) {

		if (map.containsKey("potato")) {
			map.put("fries", map.get("potato"));

		}
		if (map.containsKey("salad")) {
			map.put("spinach", map.get("salad"));

		}
		return map;

	}
	
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> map=new HashMap<>();
		for (String string : strings) {
			if(map.containsKey(string))
				 map.put(string, true);
			else 
				 map.put(string, false);
		}
		return map;
	}

	
	/*public String[] allSwap(String[] strings) {
		Map<String, Integer> map= new HashMap<>();
		int i=0;
		for (String string : strings) {
			
			map.put(string,i);
			i++;
		}
		
	}
*/
	
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map= new HashMap<>();
		for (String string : strings) {
			if(map.containsKey(string))
			map.put(string, map.get(string)+1);
			else
				map.put(string, 1);
		}
		return map;
	}


	public Map<String, String> firstChar(String[] strings) {
    Map<String,String> map = new HashMap<>();
    for (String string : strings) {
    	String s=string.substring(0,1);
		if(map.containsKey(s))
			map.put(s, map.get(s)+string);
		else
			map.put(s, string);
		
	}
    return map;
	}

/*	
	public String wordAppend(String[] strings) {
		Map<String,Integer> map= new HashMap<>();
		String append="";
		  for (String string : strings) {
			if(map.containsKey(string))
				 { 
				   map.put(string, map.get(string)+1);
				   if(map.get(string)%2==0)
				   {
					   map.put(string, 0);
					   append+=string;
				   }
				 }
			else
				 map.put(string, 1);
			
		}
		  
		  return append;
	}
*/
	
	public Map<String, String> mapAB2(Map<String, String> map) {

		if (map.containsKey("a") && map.containsKey("b") && map.get("b").equals(map.get("a"))) {
			map.remove("a");
			map.remove("b");
		}

		return map;

	}

	public Map<String, String> mapAB3(Map<String, String> map) {

		if (map.containsKey("a") && !map.containsKey("b")) {
			map.put("b", map.get("a"));
		}
		if (map.containsKey("b") && !map.containsKey("a")) {
			map.put("a", map.get("b"));
		}
		return map;

	}

	public Map<String, String> mapAB4(Map<String, String> map) {

		if (map.containsKey("a") && map.containsKey("b")) {
			if (map.get("b").length() == map.get("a").length()) {
				map.put("b", "");
				map.put("a", "");
			} else if (map.get("b").length() < (map.get("a").length()))
				map.put("c", map.get("a"));
			else
				map.put("c", map.get("b"));
		}

		return map;

	}

	/* FUNCTIONAL INTERFACE PROGRAMMING */

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(n -> n < 0);
		return nums;
	}

	public List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
		// OR the equivalent java streams solution:
		// return nums.stream()
		// .map(n -> n * 2)
		// .collect(Collectors.toList());
	}

	public List<Integer> square(List<Integer> nums) {
		return nums.stream().map(n -> n * n).collect(Collectors.toList());
	}

	public List<String> addStar(List<String> strings) {
		strings.replaceAll(n -> n + "*");
		// return strings;
		return strings.stream().map(n -> n + "*").collect(Collectors.toList());
	}

	public List<String> copies3(List<String> strings) {
		strings.replaceAll(n -> n + n + n);
		return strings;
	}

	public List<String> moreY(List<String> strings) {
		strings.replaceAll(n -> "y" + n + "y");
		return strings;
	}

	public List<Integer> math1(List<Integer> nums) {
		nums.replaceAll(n -> (n + 1) * 10);
		return nums;
	}

	public List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll(n -> n % 10);
		return nums;
	}

	public List<String> lower(List<String> strings) {
		strings.replaceAll(n -> n.toLowerCase());
		return strings;
	}

	public List<String> noX(List<String> strings) {
		strings.replaceAll(n -> n.replaceAll("x", ""));
		return strings;
	}

	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf(n -> n % 10 == 9);
		return nums;
	}

	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(n -> n > 12 && n < 20);
		return nums;
	}

	public List<String> noLong(List<String> strings) {
		strings.removeIf(n -> n.length() > 3);
		return strings;
	}

	public List<String> noZ(List<String> strings) {
		strings.removeIf(n -> n.contains("z"));
		return strings;
	}

	public List<String> no34(List<String> strings) {
		strings.removeIf(n -> n.length() == 3 || n.length() == 4);
		return strings;
	}

	public List<String> noYY(List<String> strings) {
		strings.replaceAll(n -> n + "y");
		strings.removeIf(n -> n.contains("yy"));
		return strings;
	}

	public List<String> noXY(List<String> strings) {
		strings.removeIf(n -> n.contains("xy"));
		return strings;
	}

	public List<Integer> two2(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		nums.removeIf(n -> n % 10 == 2);
		return nums;
	}

	public List<Integer> square56(List<Integer> nums) {
		nums.replaceAll(n -> (n * n) + 10);
		nums.removeIf(n -> (n % 10 == 5 || n % 10 == 6));
		return nums;
	}

	void p() {

		n();
		System.out.println("p method's try block ");

		System.out.println("p  method ");
	}

	public static void main(String args[]) {
		ExceptionHandlingMapJava8 obj = new ExceptionHandlingMapJava8();
		obj.p();
		List<String> alphabets = Arrays.asList(new String[] { "a", "b", "b", "d" });

		alphabets.forEach(l -> System.out.println(l.toUpperCase()));
		alphabets.forEach(System.out::println);
		System.out.println("normal flow...");

		System.out.println("This is the email filtering :-");
		emailFilter();

		System.out.println("This is the random number generation :-");
		randomNumbersStream();

	}

	/**
	 * 
	 */
	private static void randomNumbersStream() {
		Random random = new Random();

		// Five random integers
		
		System.out.println(" Five random integers ");
		
		System.out.println("This is going to the best !!! ");
		random.ints(5).sorted().forEach(System.out::println);

		
        random.longs().limit(4).forEach(System.out::println);
		
     // Five random doubles between 0 (inclusive) and 0.5 (exclusive)
		System.out.println("Five random doubles between 0 (inclusive) and 0.5 (exclusive)");
		random.doubles(5, 0, 0.5).sorted().forEach(System.out::println);

		// Boxing long to Long so they can be collected
		System.out.println("Boxing long to Long so they can be collected");
		List<Long> longs = random.longs(5).boxed().collect(Collectors.toList());
		System.out.println(longs);
	}

	/**
	 * 
	 */


	private static void emailFilter() {
		Predicate<String> emailFilter = Pattern.compile("^(.+)@example.com$").asPredicate();

		// Input list
		List<String> emails = Arrays.asList("alex@example.com", "bob@yahoo.com", "cat@google.com", "david@example.com");

		// Apply predicate filter
		List<String> desiredEmails = emails.stream().filter(emailFilter).collect(Collectors.toList());

		// Now perform desired operation
		desiredEmails.forEach(System.out::println);

	}

}