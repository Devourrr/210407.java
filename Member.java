package week3_day3;

public class Member {
	String name;
	String addr;
	
	// »ı¼ºÀÚ
	
	public Member() {
		
	}
	public Member(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	public String getMemberInfo() {
		return name + " " + addr;
		
	}

}

