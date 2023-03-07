package sec03;

public class _03LPrinterDriver implements _01Printable {

	@Override
	public void print(String doc) {
		System.out.println("From LG Printer");
		System.out.println(doc);
	}
}
