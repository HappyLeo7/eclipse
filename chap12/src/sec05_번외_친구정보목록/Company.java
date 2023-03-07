package sec05_번외_친구정보목록;

public class Company {
//2개의 필드
	
	private String cName; 
	Continfo cInfo;
	
	
	//생성자 (this)
	public Company(String cName,Continfo cinfo) {
		this.cName=cName;
		this.cInfo=cinfo;
		
	}

//get 2개
	public String getcName() {
		return cName;
	}




	public Continfo getcInfo() {
		return cInfo;
	}


	
	
}
