package ch15homework.problems.Exercise08;

public class Student {
	
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentNum; 
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if(s instanceof Student) {
			if(studentNum == s.studentNum) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	
	}
	
	

}
