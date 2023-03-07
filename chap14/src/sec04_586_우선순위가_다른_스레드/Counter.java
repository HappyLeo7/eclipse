package sec04_586_우선순위가_다른_스레드;

public class Counter extends Thread {
	private int count = 0;

public Counter(String name){
	setName(name);
}

public void run() {
	//반복
	while(count++<5) {
		System.out.print(getName()+"-> ");
	
		try {
			sleep(500);
		} catch (InterruptedException e) {
		}
	
	}
	System.out.println("종료");
}
}
