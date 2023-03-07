package sec03;

public class _03SPrinterDriver implements _01Printable {
	@Override
	public void print(String doc) {
		System.out.println("From Samsung Printer");
		System.out.println(doc);
	}
}
