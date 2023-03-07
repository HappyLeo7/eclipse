package sec12_1;

public class Papers {
	// 필드
	private String con;

//생성자
	public Papers(String c) {
		this.con = c;
	}

//매서드
	public Printable getPrintar() {
		return new Printable() {

			@Override
			public void print() {
				System.out.println(con);
			}

		};
	}
}
