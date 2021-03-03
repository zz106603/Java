package ch15homework.problems.Exercise08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetExample {

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<Student>();
		
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(2, "����ȯ");
		Student s3 = new Student(1, "������");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student stu = it.next();
			System.out.println(stu.studentNum + ": " + stu.name);
		}

	}

}
