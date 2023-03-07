package ex_05;

public class Telephone extends Phone{

private String when;

Telephone(String owner,String when){
	super(owner);
	this.when=when;
}

void autoAnswering() {
	System.out.println(owner+"가 부재 중이니 "+when+"에 전화 요망");
}
}
