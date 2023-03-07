package ex_p208_211;

public class _06_2 {
	public static void main(String[] args) {

		int[] arrays = { 5, 6, 3, 0, 9 };
		for (int array : reverse(arrays)) {
			System.out.print(array + " ");
		}
	}

	public static int[] reverse(int[] org) {
		int[] reverseArrays = new int[org.length];
		for (int i = 0; i < org.length; i++) {
			reverseArrays[i] = org[org.length - i - 1];
		}
		return reverseArrays;
	}
}
