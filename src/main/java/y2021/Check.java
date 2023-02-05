package y2021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee
{int id;
Address address;

public Employee() {
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Employee(int id, Address address) {
	super();
	this.id = id;
	this.address = address;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", address=" + address + "]";
}


	}

class Address
{
	String city;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String city) {
		super();
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	}
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1,new Address("Shamli")));
		list.add(new Employee(2,new Address("Dehradun")));
		list.add(new Employee(3,new Address("zgartala")));
	list.forEach(System.out::println);
	//	Collections.sort(list, (e,e1)-> e.getAddress().getCity().compareTo(e1.getAddress().getCity()));
		
		
		  list.stream().sorted(Comparator.comparing(Employee::getAddress,(s1,s2)->
		  s1.getCity().compareTo(s2.getCity()))).forEach(System.out::println);;
		 list.forEach(System.out::println);
		
		Map<Integer,Character> map= new HashMap<>();
		map.put(1,'a');
		map.put(2, 'b');
		map.put(3, 'c');
		map.put(4, 'a');
		System.out.println(map);
		map=map.entrySet().stream().filter(e -> e.getValue().equals('a')).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map);
		
		
		
		
    }
    
   



	public static String jsonString() {
        String str = "{\"studentId\": 1001, \"studentName\": \"Rajesh\","
                + "\"roleNumber\": \"106\",\"standard\": \"11th\"}";
        return str;
    }

}
