package sec06_동기화예제;

public class LibraryDemo {
	
	
	public static Library library=new Library();
	
	
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student student6 = new Student();
		Student student7 = new Student();
		Student student8 = new Student();
		Student student9 = new Student();
		Student student0 = new Student();
		
		
		student0.start();
		student1.start();
		student2.start();
		student3.start();
		student4.start();
		student5.start();
		student6.start();
		student7.start();
		student8.start();
		student9.start();
		
		
		
	}
}
