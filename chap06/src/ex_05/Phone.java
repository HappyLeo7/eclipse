package ex_05;

public class Phone {
protected String owner;
Phone(String o){
	this.owner=o;
}
void talk() {
	System.out.println(owner+"가 통화중");
}
}
