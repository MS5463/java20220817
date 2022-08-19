package ch03.book_03;

public class P071_IncreseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------");
		x++;
		++x;
		System.out.println("x=" +x);
		
		System.out.println("-----------");
		y--;
		--y;
		System.out.println("y=" +y);
		
		System.out.println("-----------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------");
		z = ++x + y ++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
//71p