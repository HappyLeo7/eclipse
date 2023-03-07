package sec04_586_우선순위가_다른_스레드;

public class PriorityDemo {
	public static void main(String[] args) {
		Counter c1 = new Counter("느긋함");
		c1.setPriority(Thread.MIN_PRIORITY); // 1값
		Counter c2 = new Counter("급함");
		c2.setPriority(Thread.MAX_PRIORITY); // 1값
		c1.start();
		c2.start();

	}
}
