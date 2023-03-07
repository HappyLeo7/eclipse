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

		try {
			for(int i=1;i<=2;i++) {
//			System.out.println("페이지 : " + 1);

			Document dc = Jsoup.connect("https://trends.google.co.kr/trends/trendingsearches/daily?geo=KR#%ED%95%9C%EB%8F%99%ED%9B%88").get();
			Elements title = dc.select("div.feed-item.contracted-item div");
//			Elements title1 = dc.select("body li.basicList_item__0T9JD span");
			System.out.println(title.text());
//			System.out.println(title1.get(i).text());
			System.out.println("19금");
			v.getTitle("19금");
			System.out.println("------------------------------------");
			}
//			for(int i=1;i<=2;i++) {
////			System.out.println("페이지 : " + 1);
//				
//				Document dc = Jsoup.connect("https://search.shopping.naver.com/search/all?frm=NVSHATC&origQuery=%EC%8B%9C%EA%B3%84&pagingIndex=1&pagingSize=40&productSet=total&query=%EC%8B%9C%EA%B3%84&sort=rel&timestamp=&viewType=list").get();
//				Elements title = dc.select("body li.basicList_item__0T9JD a.basicList_link__JLQJf");
//				Elements title1 = dc.select("body li.basicList_item__0T9JD span");
//				System.out.println(title.get(i).text());
//				System.out.println(title1.get(i).text());
//				System.out.println("------------------------------------");
//			}
			// 식당이름
//			Elements title = dc.select("span.title");
//			System.out.println(title.get(0).text());
//
//			// 식당설명
//			Elements Explanation = dc.select("span.small-text");
//			System.out.println(Explanation.get(0).text());
//
//			// 리뷰수
//			Elements reviews = dc.select("span.trip-text");
//			System.out.println(reviews.get(0).text());
//
//			Document dc_s = Jsoup.connect(
//					"https://korean.visitseoul.net" + (dc.select("ul.article-list li.item a")).get(0).attr("href"))
//					.get();
//			Elements phone = dc_s.select("div.detail-map-infor dl dt");
//			for (int i = 0; i <= 15; i++) {
//				if (phone.text().contains("전화")) {
//					System.out.println("없음");
//				}else {
//					break;
//				}
//			}
//			System.out.println(phone.get(i).text());
//			System.out.println(title.get(0).text());
//		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}