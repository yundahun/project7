package arraylist;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student student1 = new Student(1001, "윤다훈");
		Student student2 = new Student(1002, "남택호");
		
		list.add(student1);
		list.add(student2);
		list.add(new Student(1003,"아무개"));
		
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			student.showStudentInfo();
		}
		
		System.out.println();
		
		for (Student student : list) {
			student.showStudentInfo();
		}
	}

}

class Student {
	
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID + "," + name);
	}
}