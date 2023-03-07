package exx07_o;

import java.util.Arrays;
import java.util.List;

public class Person {
// 이름,신장,체중
	String name;
	int kidney;
	int weight;
	
	 Person(String n,int k,int w){
		this.name=n;
		this.kidney=k;
		this.weight=w;
	}
	 public int getkidney(){
		 return kidney;
	 }
	  public int getweight(){
		  return weight;
	  }
	 
	 public static final List<Person> persons =
			 Arrays.asList(
					 new Person("황진이",160,45),
					 new Person("이순신",180,80),
					 new Person("김삿갓",175,65),
					 new Person("홍길동",170,68),
					 new Person("배장화",155,48)
					 ); 
	
}
