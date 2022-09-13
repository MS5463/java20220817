package ch13.book_13.P669;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
