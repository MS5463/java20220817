package ch13.book_13.P662;

public class Pair {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public void setKey(K key) { this.key = key; }
	public void setValue(K value) { this.value = value; }
	public K getKey() { return key; }
	public V getValue() { return value; }
}
