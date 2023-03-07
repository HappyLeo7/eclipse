package exx07_o;

import java.util.List;
import java.util.function.ToIntFunction;

public class PersonTest {
public static void main(String[] args) {
//	ToIntFunction<Person> m1=x->x.getkidney();
//	for(Person p:Person.persons)
//	System.out.println(m1.applyAsInt(p));
///////////////////////////////////////////////////////
	double kidney1=aa(Person.persons, x->x.getkidney());
	double weight2=aa(Person.persons, x->x.getweight());
	
	System.out.println("평균 신장 : "+kidney1);
	System.out.println("평균 체중 : "+weight2);
///////////////////////////////////////////////////////
}

static public double aa(List<Person> persons,ToIntFunction<Person> p ) {
	double s=0.0;
	
	for(Person person:persons) {
		s +=p.applyAsInt(person);
	}
	return s/persons.size();
}
}
