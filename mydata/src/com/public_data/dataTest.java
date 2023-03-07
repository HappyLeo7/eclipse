package com.public_data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class dataTest {
	List<dataVO> list = new ArrayList<>();

	public static void main(String[] args) {
		dataTest dt = new dataTest();
		dt.data();
	}

	private void data() {
		dataDAO da = dataDAO.newInst();
		dataVO v = new dataVO();
		int num = 1;
		try {
			for (int i = 1; i < 100; i++) {
				// 페이지수 표시
				System.out.println("--------------------" + i + "페이지----------------------------");

				// 페이지 주소링크
				Document doc = Jsoup.connect("https://opengov.seoul.go.kr/data/list?page=" + i).get();

				// html를 통해서 위치를 찾아서 자료를 가져온다
				Elements title1 = doc.select("thead tr th:eq(1)"); // 제목
				Elements title = doc.select("tbody tr td.data-title a"); // 제목 : ???

				Elements registration_date1 = doc.select("thead tr th:eq(2)"); // 생산일
				Elements registration_date = doc.select("tbody tr td.data-date"); // 생산일 : ???

				Elements views1 = doc.select("thead tr th:eq(3)"); // 조회수
				Elements views = doc.select("tbody tr td.data-hit "); // 조회수

				// 14개의 항목에 따른 자료를 불러옴
				for (int j = 0; j <= 14; j++) {
					System.out.println(num + "번");
					num++;
					System.out.println(title1.text() + " : " + title.get(j).text()); // 출력) 제목 : ???
					v.setTitle(title.get(j).text()); //db로 제목 값을 보내는 코드

					System.out.println(registration_date1.text() + " : " + registration_date.get(j).text()); // 출력) 생산일
																												// : ???
					v.setRegistration_date(registration_date.get(j).text()); //db로 생산일 값을 보내는 코드

					System.out.println(views1.text() + " : " + views.get(j).text()); // 출력) 조회 : ???
					v.setViews(views.get(j).text()); //db로 조회 값을 보내는 코드

					// 링크 클릭주소 가져오기
					Elements link = doc.select("tbody tr td.data-title a"); // 링크
					Document doc_a = Jsoup.connect("https://opengov.seoul.go.kr/" + link.get(j).attr("href")).get();

					// 기관명
					Elements institution_name1 = doc_a.select("tbody tr:eq(0) th"); // 기관명
					Elements institution_name = doc_a.select(".table-wrap tbody tr td:nth-child(1n)"); // 기관명 : ???
					System.out.println(institution_name1.get(0).text() + " : " + institution_name.get(0).text()); // 출력)
																													// 기관명:???
					v.setInstitution_name(institution_name.get(0).text());

					// 부서
					Elements department1 = doc_a.select("tbody tr th.tline"); // 부서
					Elements department = doc_a.select("tbody tr td.tline:nth-child(2n)"); // 부서 : ???
					System.out.println(department1.get(0).text() + " : " + department.get(0).text());
					v.setDepartment(department.get(0).text());

					// 책임자
					Elements manager1 = doc_a.select("tbody tr:nth-child(2n) th"); // 책임자
					Elements manager = doc_a
							.select("div.table-wrap table.table tbody tr:nth-child(2n) td:nth-child(2n)"); // 책임자 : ???
					System.out.println(manager1.get(0).text() + " : " + manager.get(0).text());
					v.setManager(manager.get(0).text());

					// 관리자번호
					Elements management_number1 = doc_a.select("tbody tr:nth-child(3n) th"); // 관리번호
					Elements management_number = doc_a.select("div.table-wrap table.table tbody tr:nth-child(3n) td");// 관리번호
																														// :
																														// ???
					System.out.println(management_number1.get(0).text() + " : " + management_number.get(0).text());
					v.setManagement_number(management_number.get(0).text());

					v.setNo(j); //넘버링
					da.datainst(v); // 데이터를 보냄
					System.out.println("---------------------------------------------------------------");
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}