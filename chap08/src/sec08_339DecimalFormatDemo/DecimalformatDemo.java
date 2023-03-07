package sec08_339DecimalFormatDemo;

import java.text.DecimalFormat;

public class DecimalformatDemo {
	public static void main(String[] args) {
		DecimalFormat f1 = new DecimalFormat("#");
		DecimalFormat f2 = new DecimalFormat("000000000.00");
		DecimalFormat f3 = new DecimalFormat("#.000");
		DecimalFormat f4 = new DecimalFormat("#,###.##");
		DecimalFormat f5 = new DecimalFormat("-#.#");
		DecimalFormat f6 = new DecimalFormat("#.##E00");
		DecimalFormat f7 = new DecimalFormat("+#.#;-#.#");
		DecimalFormat f8 = new DecimalFormat("#.00%");
		DecimalFormat f9 = new DecimalFormat("\u00A4###,###.##"); // 원화 표시
		DecimalFormat f10 = new DecimalFormat("\u00A5###,###.##"); //

		System.out.println(f1.format(1234567.890));
		System.out.println(f10.format(1234567.890));

	}
}
