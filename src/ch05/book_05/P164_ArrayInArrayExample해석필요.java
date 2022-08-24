package ch05.book_05;

import java.util.Arrays;

public class P164_ArrayInArrayExample해석필요 {
	public static void main(String[] args) {
		
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[1].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"] = "
						+mathScores[i][k]);
			}
		}
		System.out.println();
		int[][] englishScores = new int[2][];
		englishScores[0]  = new int[2];
		englishScores[1]  = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("enligshScores["+i+"]["+k+"] = "
						+englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95, 80}, {92, 86, 80} };
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"] = "
						+javaScores[i][k]);
			}
		}
		//for 없이 배열 item 출력
		int[] a = {2, 3, 4, 5};
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.toString(javaScores));
		System.out.println(Arrays.toString(javaScores[0]));
		System.out.println(Arrays.toString(javaScores[1]));
		
		System.out.println(Arrays.deepToString(javaScores));
		
	}
}
//164p