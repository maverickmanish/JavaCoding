package udemy.in28minutes;

public class Student {
	// Class data members
	private int rollno;
	private String studentname;
	private int studentage;
	
	public Student(int rollno, String studentname, int studentage) {
		super();
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}



	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		result = prime * result + studentage;
		result = prime * result + ((studentname == null) ? 0 : studentname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollno != other.rollno)
			return false;
		if (studentage != other.studentage)
			return false;
		if (studentname == null) {
			if (other.studentname != null)
				return false;
		} else if (!studentname.equals(other.studentname))
			return false;
		return true;
	}

}
