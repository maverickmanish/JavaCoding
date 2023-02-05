package udemy.in28minutes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FirstIPO {

	public static void main(String[] args) {
		List<Student> arraylist = new ArrayList<>();
		arraylist.add(new Student(12, "Riya", 15));
		arraylist.add(new Student(14, "Mahima", 1));
		arraylist.add(new Student(13, "Shubhi", 12));
		arraylist.stream().sorted(Comparator.comparing(Student::getStudentage)).collect(Collectors.toList());
		System.out.println();
	}

}
