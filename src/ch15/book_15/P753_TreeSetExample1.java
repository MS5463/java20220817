package ch15.book_15;

import java.util.TreeSet;

public class P753_TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));// 사용하는 메소드난 생성자 중에서 선이 그러어 있는것은
		scores.add(new Integer(98));// deprecated으로 문법상 문제가 없으나 이클립스가
		scores.add(new Integer(75));// 사용하지 않는 것을 권장하지 않은 것을 뜻함 
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score + "\n");
		
		score = scores.floor(new Integer(95));
		System.out.println("95점 이하의 점수: " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이상의 점수: " + score + "\n");
		
		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
	}
}
