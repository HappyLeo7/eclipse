package Sec01;

import java.util.Scanner;

public class $02 {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);
		System.out.println("학점 : ");
		int grades = inScanner.nextInt();
		String gr;
//		if (grades >= 91) {
//			System.out.println("A");
//		} else if (grades >= 80) {
//			System.out.println("B");
//		} else if (grades >= 70) {
//			System.out.println("C");
//		} else if (grades >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}

//		if (grades >= 91) {
//			gr = "A";
//		} else { if (grades >= 80) {
//			gr = "B";
//		} else if (grades >= 70) {
//			gr = "C";
//		} else if (grades >= 60) {
//			gr = "D";
//		} else {
//			gr = "F";
//		}
//
//		System.out.println("당신의 학점은 : " + gr);

		if (grades >= 90) {
			gr = "A";
		} else {
			if (grades >= 80) {
				gr = "B";
			} else {
				if (grades >= 70) {
					gr = "C";
				} else {
					if (grades >= 60) {
						gr = "D";
					} else

						gr = "F";
				}
			}
		}

		System.out.println("당신의 학점은 : " + gr);

	}

}
