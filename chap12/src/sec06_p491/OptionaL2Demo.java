package sec06_p491;

import java.util.Optional;

import sec01_p479.Util;

public class OptionaL2Demo {
public static void main(String[] args) {
	String s1="안녕!";
	Optional<String> o=Optional.ofNullable(s1);
			
			if(s1 !=null) 
				Util.Printable(null);
			else 
				Util.Printable("없음");	
				
			
			if(o.isPresent()) 
				Util.Printable(o.get());
			else 
				Util.Printable("없음");
			
			
			String s2=o.orElse("없음");
			Util.Printable(s2);
			
			o.ifPresentOrElse(Util::Printable,()->System.out.println("없음"));
			//ifPresentOrElse (있으면 앞에 처리 , 없으면 뒤처리) 
			
}
}
