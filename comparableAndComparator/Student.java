package comparableAndComparator;

public class Student {
	
	int marks;
	String name;
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Student obj) {
		return this.marks - obj.marks;
	}

//	@Override
//	public int compareTo(Student obj) {
//		if(this.marks > obj.marks) return 1;
//		else if(this.marks < obj.marks) return -1;
//		//return 0;
//		
//		return this.name.compareTo(obj.name);
//	}
	
	
	
	
}
