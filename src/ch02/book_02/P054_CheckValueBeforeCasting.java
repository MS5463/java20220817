package ch02.book_02;

public class P054_CheckValueBeforeCasting {
		public static void main(String[] args) {
			int i = 128;
			
			if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) {//||은 or이며 둘 중 하나가 True일경우 값은 True 가 된다
			  /*(i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)은 (i<-128) || (i>127)과 동일*/
				
				System.out.println("byte 타입으로 변환할 수 없습니다.");
				System.out.println("값을 다시 확인해 주세요.");	
				} else {
					byte b = (byte) i;
					System.out.println(b);
				}
		}
}
//54p