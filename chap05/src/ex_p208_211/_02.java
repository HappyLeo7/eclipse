package ex_p208_211;

public class _02 {
	public static void main(String[] args) {
//	_02_Class =new _02_Class;
//		_02_Class sumExcerptFirst = new _02_Class;

//		int sumExcptFirst = 0;
//
//		for (int i = 0; i < sumExcerptFirst.length; i++) {
//			sumExcptFirst = i;
//		}

		System.out.println(sumExceptFirst(1, 2, 3, 4)); // sumExceptFirst 값이 필요
		int arr[] = { 2, 3 }; // arr 변수 (2와 3이 들어있는 배열)

		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));

//
	}

	private static int sumExceptFirst(int i, int... v) {
		int sum = 0;

		for (int i1 : v) {
			sum += i1;

			// arr[i] += n;
//			System.out.println(i1);
//			System.out.println(v);
//			System.out.println(sum);
		}
		return sum;
	}

	// 위의 for문만으로도 완성됨
//	private static int sumExceptFirst(int i, int j, int k, int l) {
//		return j + k + l;
//	}
//
////
//	private static int sumExceptFirst(int i, int j, int k, int l, int a) {
//		return j + k + l + a;
//	}

}
