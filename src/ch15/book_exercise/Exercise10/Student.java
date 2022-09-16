package ch15.book_exercise.Exercise10;

public class Student implements Comparable<Student> {
	public String id;
	public int score;
	
	public Student (String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.scores - o.scores
	}
}

