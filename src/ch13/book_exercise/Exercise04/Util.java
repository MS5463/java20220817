package ch13.book_exercise.Exercise04;

public class Util {
	static <K, V> V getValue(Pair<? extends K, ? extends V> pair, K key) {
		if (pair.getKey().equals(key)) {
			return pair.getValue();
		}
		return null;
	}
}
