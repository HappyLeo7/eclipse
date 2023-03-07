package exx05;

public class TV extends Controller {
	public TV(boolean power) {
		super(power);
		// TODO Auto-generated constructor stub
	}

	// 필드
	Boolean TVoff;

	// 생성자
//	public TV(Boolean t) {
//		this.TVoff=t;
//	}
	@Override
	void show() {
		if (TVoff == true) {
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 꺼졌습니다.");

		}
	}

}
