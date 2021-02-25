package ch11.exam01;

public class Member {
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj){	//equals 메소드 재정의 
		if(obj instanceof Member) {
			Member m = (Member)obj;
			if(id.equals(m.id) && name.equals(m.name)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
}
