package sec08;

public class Report implements Printable {

	// 필드
	String cons;

	Report(String cons) {
		this.cons = cons;
	}

	@Override
	public String getContents() {
		return cons;
	}
}
