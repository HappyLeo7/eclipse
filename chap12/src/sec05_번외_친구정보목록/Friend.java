package sec05_번외_친구정보목록;

public class Friend {

	
	String name;
	Company cmp;  // null 일 수 있음
	
	//생성자
	public Friend(String name,Company cmp) {
		this.name=name;
		this.cmp=cmp;
	}
	
	
	public String getName() {
	return name;}
	
	public Company getCmp() {
		return cmp;
	}
}
