package arraylist;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		// 학생 생성
		Student2 student1 = new Student2("다훈");
		
		// 수강하는 과목을 추가
		student1.subjectList.add(new Subject("프론트엔드", 85));
		student1.subjectList.add(new Subject("백엔드", 80));
		
		// 정보 출력
		student1.showInfo();
		
		// 학생 생성
		Student2 student2 = new Student2("택호");
		
		// 수강하는 과목을 추가
		student2.subjectList.add(new Subject("프론트엔드", 65));
		student2.subjectList.add(new Subject("백엔드", 95));
		student2.subjectList.add(new Subject("팀프로젝트", 80));
		student2.subjectList.add(new Subject("도덕", 75));
		
		student2.showInfo();
	}

}

// 과목 클래스
class Subject {
	String name; // 과목명
	int score; // 점수
	
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Student2 {
	
	String studentName; // 학생의 이름
	ArrayList<Subject> subjectList; // 수강 과목
	
	public Student2(String studentName) {
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	// 학생의 총 점수를 출력하는 메소드
	public void showInfo() {
		int total = 0; //총 점수
		
		for (Subject s : subjectList) {
			total += s.score;
		}
		System.out.println(studentName + "학생의 총점은 " + total + " 입니다");
	}
}