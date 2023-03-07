package sec06_동기화예제;

public class Student extends Thread{

	@Override
	public void run() {
//		Library library=new Library(); //Library 도서관 클래스를 가져옴
		String title;
		try {
			title=LibraryDemo.library.lendBook();
			if(title==null) return;
			sleep(5000);
			LibraryDemo.library.returnBook(title);
		} catch (InterruptedException e) {
		}
	}
	

}
