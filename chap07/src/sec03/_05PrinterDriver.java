package sec03;

public class _05PrinterDriver {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";

//삼성프린터로 출력
		_01Printable prn = new _03SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// LG프린터로 출력
		prn = new _03LPrinterDriver(); // 위에서 Printable prn 을 변환했기때문에 아래에서 prn만 사용해도 됨
		prn.print(myDoc);

	}
}
