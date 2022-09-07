package ch11.book_11;

public class P463_Member {//extends Object
	public String id;
	
	public P463_Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof P463_Member) {
			P463_Member member = (P463_Member) obj;
			if (id.equals(member.id)) {	
				return true;			
			}							 
		}
		return false;
		}
	
		@Override					// ┐
		public int hashCode() {		// │ id가 동일한 문자열인 경우
			return id.hashCode();	// │ 같은  해시 코드를 리턴
		}							// ┘
	}
