package ScoreTrakker;

public class Student implements Comparable<Student>{

	private String name;
	private int score;
	
	
	public Student( String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
	public String toString(){
		return name + " " + score;
	}

	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if (this.score < s.score) {
			return -1;
		}
		else return 1; 
	}
	
}
