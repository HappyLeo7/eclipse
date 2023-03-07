package sec05_번외_친구정보목록;

public class NullPointerCaseStudy {
public static void main(String[] args) {
	
	Continfo ci =new Continfo("321-444-577", "Republic of Korea");
	Company cp =new Company("Yaho cp., Ltd.", ci);
	Friend frn = new Friend("LEE SU", cp);
	
	
	showCompAddr(frn);   // 매서드가 없어서 만들어야함
	
}

private static void showCompAddr(Friend frn) {
String addr=null;

if (frn !=null) {
	Company com = frn.getCmp();
	if (com != null) {
		Continfo info = com.getcInfo();
		if (info !=null) {
			addr=info.getAdrs();
		}
	}
}if (addr !=null) {
	System.out.println(addr);
}else {
	System.out.println("주소 정보가 없습니다.");
}
	
}
}
