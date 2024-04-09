package array;

public class Quiz8 {

	public static void main(String[] args) {

		Student[] students= new Student[3];
		
		students[0] = new Student(1001, "윤다훈");
		students[1] = new Student(1002, "남택호");
		students[2] = new Student(1003, "김말숙");
		
		for (int i = 0; i < students.length; i++) {
			students[i].showInfo();
		}
	}

}

class Student {
	
	int studentID; // 학번
	
	String name; // 이름

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(studentID + "," + name);
	}
}