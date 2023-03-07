package sec07;

import java.util.Optional;

import sec05_번외_친구정보목록.Company;
import sec05_번외_친구정보목록.Continfo;
import sec05_번외_친구정보목록.Friend;

public class NullPointerCaseStudy2 {
public static void main(String[] args) {
	
	Continfo ci =new Continfo("321-444-577", "Republic of Korea");
	Company cp =new Company("Yaho cp., Ltd.", ci);
	Friend frn = new Friend("LEE SU", cp);
	
	
//	showCompAddr(frn);   // 매서드가 없어서 만들어야함
	showCompAddr(Optional.of( frn));   // 매서드가 없어서 만들어야함
	
}

///////////////////////////////////////////////////////
//private static void showCompAddr(Friend frn) {
//	String addr=null;
//if (frn !=null) {
//	Company com = frn.getCmp();
//	if (com != null) {
//		Continfo info = com.getcInfo();
//		if (info !=null) {
//			addr=info.getAdrs();
//		}
//	}
//}if (addr !=null) {
//	System.out.println(addr);
//}else {
//	System.out.println("주소 정보가 없습니다.");
//}
//////////////////////////////////////////////////////


	//위와 아래가 같고 아래와 같이 간략히 사용가능 8버전 이상부터
	
public static void showCompAddr(Optional<Friend> frn) {
	String addr=frn .map(Friend::getCmp)
					.map(Company::getcInfo)
					.map(Continfo::getAdrs)
					.orElse("주소가 없어요.");
	System.out.println(addr);
}



}
