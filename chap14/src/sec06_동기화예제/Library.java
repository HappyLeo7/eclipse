package sec06_동기화예제;

import java.util.ArrayList;

public class Library {
	///////////////////////////
public ArrayList<String> shelf=new ArrayList<>();
public Library() {
	shelf.add("쉽게 배우는 자바 프로그래밍");
	shelf.add("웹 프로그래밍 기초");
	shelf.add("Java의 정성");
}
public synchronized String lendBook() throws InterruptedException {
	Thread t=Thread.currentThread();//스레드?
	
	while(shelf.size()==0) {
		System.out.println(t.getName()+"waiting start");
		wait();
		System.out.println(t.getName()+"waitng end");
	}
	String book = shelf.remove(0);
	System.out.println(t.getName()+": "+book+" lend");
	
	return book;
}

public synchronized void returnBook(String book) {
	Thread t=Thread.currentThread(); //스레드를 가지고옴
	
	shelf.add(book);
	notify();
	System.out.println(t.getName()+": "+book+ " return");
}
/////////////////
}
