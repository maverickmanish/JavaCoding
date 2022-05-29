import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Student {

	private String name;
	private int id;
	private Address address;
	private List<String> subjects;
	private Map<Integer, String> rank_value;
	private Map<Answer, User> answers;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id, Address address, List<String> subjects, Map<Integer, String> rank_value,
			Map<Answer, User> answers) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.subjects = subjects;
		this.rank_value = rank_value;
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + ", subjects=" + subjects
				+ ", rank_value=" + rank_value + ", answers=" + answers + "]";
	}

	public void display() {
		Iterator<String> itr = subjects.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		System.out.println("Now ... MAP iteration ");

		for (Map.Entry<Integer, String> e : rank_value.entrySet()) {
			System.out.println(" #" + e.getKey() + "  === " + e.getValue());

		}

		for (Map.Entry<Answer, User> em : answers.entrySet()) {
			Answer an = em.getKey();
			User us = em.getValue();
			
			System.out.println(" User :" + us + "  ... answered ---->" + an);
		}
	}
}
