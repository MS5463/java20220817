package ch11.book_11.P459;

public class Member {//extends Object
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {//.....매개값이 Member 타입인지 확인
			Member member = (Member) obj;// ┐ 
			if (id.equals(member.id)) {	 // │ line 13 ~ line 16 Member 타입으로 강제 타입 변환하고
				return true;			 // │ id 필드값이 동일한지 검사한 후,동일하다면 true를 리턴
			}							 // ┘ 
		}
		return false;//.....매개값이 Member타입이 아니거나 id 필드값이 다른 경우 false를 리턴
	}
}
