package downcasting;

import java.util.ArrayList;

/*
 * 사람, 학생, 회사원 클래스를 정의하세요.
 * Person형 리스트를 생성하고 학생과 회사원을 저장하세요.
 * 리스트에 저장된 사람을 모두 꺼내서, 메소드를 호출하세요.
 * */

public class Quiz2 {

	public static void main(String[] args) {

	ArrayList<Person> list = new ArrayList<Person>();
		
		list.add(new Student("지수"));
		list.add(new Employee("제니퍼"));
		
	for (Person person : list) {
		person.eat();
		
		if (person instanceof Student) {
			Student student = (Student)person;
			student.action1();
		} else if (person instanceof Employee) {
			Employee employee = (Employee)person;
			employee.action2();
		}
	
	}
		
	}



}
// 사람 클래스
class Person{
	String Name;
	
	public Person(String Name) {
		this.Name = Name;
	}
	public void eat() {
		System.out.println(Name + "밥을 먹는다");
	}
	
}
// 학생 클래스
class Student extends Person{
	public Student(String Name) {
		super(Name);
	}
	
	public void action1() {
		System.out.println(Name + " 학생이 공부를 한다");
	}
	
}
// 회사원 클래스

class Employee extends Person {

	public Employee(String name) {
		super(name);
	}

	public void action2() {
		System.out.println(Name + " 회사원이 일을 한다");
	}
}
