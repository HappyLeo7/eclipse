package exx06;

public class Student implements Human{
//필드
	int age;
	
	//생성자
	public Student(int a) {
		this.age=a;
	}
	//매서드
	
	@Override
	public void print() {
System.out.println(age+"세의 학생입니다.");		
	}
	@Override
	public void eat() {
System.out.println("도시락을 먹습니다.");		
	}


}
