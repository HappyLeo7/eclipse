package exx05;

public class Radio extends Controller {
	public Radio(boolean power) {
		super(power);
		// TODO Auto-generated constructor stub
	}

	// 필드
	Boolean Radio;

//생성자
//public Radio(Boolean r) {
//	this.Radio=r;
//}
//매서드
	@Override
	void show() {
		if (Radio == true) {
			System.out.println("라디오가 켜졌습니다.");
		} else {
			System.out.println("라디오가 꺼졌습니다.");

		}
	}
//필드
}
