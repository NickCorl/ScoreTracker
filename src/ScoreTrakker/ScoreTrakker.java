package ScoreTrakker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ScoreTrakker {
	
private ArrayList<Student> students = new ArrayList<Student>();
private Scanner in;

public void loadDataFromFile(String file){
	ArrayList<Student> students = new ArrayList<Student>();
	File fileName = new File(file);
	try {
		in = new Scanner(fileName);
		in.nextLine();
		while(in.hasNextLine() && in.hasNext()) {		
			Student s = new Student(in.next() + " " + in.next(), in.nextInt());
			students.add(s);
			//System.out.println(s);
		}	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Cannot find file!");
	}
	this.setStudents(students);
	//System.out.println(students.size());
}

public ArrayList<Student> getStudents() {
	return students;
}

public void setStudents(ArrayList<Student> students) {
	this.students = students;
}

public void printInOrder() {
	Collections.sort(students);
	System.out.println(students.size());
	for (Student test : students) {
		System.out.println(test);
	}
}

public void processFiles() {
	loadDataFromFile("scores.txt");
	printInOrder();
}

public static void main (String[] args) {
	ScoreTrakker st = new ScoreTrakker();
	st.processFiles();
}
}
