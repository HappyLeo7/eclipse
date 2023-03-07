package sec07;

public class _01Circl_Static {
//맴버,필드 작성

	double radius;
	static int numOfCircles = 0;
	int numCircles = 0;

	public _01Circl_Static(double r) { // 생성자
		this.radius = r;
		numOfCircles++;
		numCircles++;

	}
}
