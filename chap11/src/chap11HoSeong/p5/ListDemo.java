package chap11HoSeong.p5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListDemo {

	public static void main(String[] args) {
		// 스캐너로 입력값 받음
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>(); // ArrayList 생성
		int scanner; // 스캐너 인트값을 변수로 지정
		int rank = 0;

		do { // 처음 시작이 무조건 되어야하고 같은 반복을 주기 위해 do~while로 줌
			System.out.print("점수를 입력하세요 : ");
			scanner = in.nextInt();
			if (scanner > 0) { // 0보다 작을 경우 배열에 안넣기위해 if를 줌
				list.add(scanner);
			}

		} while (scanner > 0); // 0이거나 0보다 작을 경우 종료

		System.out.println("전체 학생은 " + list.size() + "명이다."); // 사이즈로 몇명인지 출력

		System.out.print("학생들의 성적 : ");
		for (int i : list) { // 성적 적은거 다 나오게끔 출력
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : list) { // 배열에 있는 값을 배열 길이로 돌리면서 한번 돌때마다 번호 +1 되고 등급에 맞춰서 출력되게끔 if문 넣음
			if (((int) (Collections.max(list))) - 10 <= i) {
				System.out.println(rank + "번 학생의 성적은 " + i + "점이며 등급은 A이다.");
				rank++;
			} else if (Collections.max(list) - 20 <= i) {
				System.out.println(rank + "번 학생의 성적은 " + i + "점이며 등급은 B이다.");
				rank++;
			} else if (Collections.max(list) - 30 <= i) {
				System.out.println(rank + "번 학생의 성적은 " + i + "점이며 등급은 C이다.");
				rank++;
			} else {
				System.out.println(rank + "번 학생의 성적은 " + i + "점이며 등급은 F이다. ㅠㅠ");
				rank++;
			}
		}

	}

}
