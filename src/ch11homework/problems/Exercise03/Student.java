package ch11homework.problems.Exercise03;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}


	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if(s instanceof Student) {
			if(s.getStudentNum().equals(studentNum)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
