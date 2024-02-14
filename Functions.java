package assignment3_part1;

import java.util.*;

public class Functions {

	ArrayList<Student> studentDatabase = new ArrayList<>();

	Scanner scan = new Scanner(System.in);

	public void addStudent() {
		System.out.println("Enter number of Students: ");
		int numStudents = scan.nextInt();

		System.out.println("Enter Student Details: ");
		for (int i = 0; i < numStudents; i++) {
			System.out.println("Name: ");
			String name = scan.next();

			System.out.println("Enter PRN: ");
			int prn = scan.nextInt();

			System.out.println("Enter Marks: ");
			double marks = scan.nextDouble();

			Student s = new Student(prn, name, marks);
			studentDatabase.add(s);
		} // for loop

	}// add function

	public void deleteStudent() {
		System.out.println("Delete Student");
		System.out.println("Enter PRN: ");
		int prn = scan.nextInt();

		for (int i = 0; i < studentDatabase.size(); i++) {
			if (studentDatabase.get(i).getPrn() == prn) {
				System.out.println(studentDatabase.get(i).getName() + " " + "removed from the Database");
				studentDatabase.remove(i);
				return;
			}
		}
		System.out.println("Student NOT FOUND");

	}

	public void printStudent(int i) {
		System.out.println("------Student Details-----");
		int p = studentDatabase.get(i).getPrn();
		String n = studentDatabase.get(i).getName();
		double m = studentDatabase.get(i).getMarks();

		System.out.println(p + "   " + n + "    " + m);
	}

	public void printStudentDetails() {
		System.out.println("------Student Details-----");
		System.out.println("PRN" + "  " + "Name" + "  " + "Marks");

		for (int i = 0; i < studentDatabase.size(); i++) {
			int p = studentDatabase.get(i).getPrn();
			String n = studentDatabase.get(i).getName();
			double m = studentDatabase.get(i).getMarks();

			System.out.println(p + "   " + n + "    " + m);
		}
	}

	public void searchStudent() {
		System.out.println("\n------SEARCH STUDENT------");
		System.out.println("Enter PRN: ");
		int p = scan.nextInt();

		for (int i = 0; i < studentDatabase.size(); i++) {
			if (studentDatabase.get(i).getPrn() == p) {
				printStudent(i);
				return;
			}
		}
		System.out.println("Student NOT FOUND");
	}

	public void updateStudent() {
		System.out.println("-----UPDATE STUDENT DETAILS----");
		System.out.println("Enter PRN: ");
		int p = scan.nextInt();

		for (int i = 0; i < studentDatabase.size(); i++) {
			if (studentDatabase.get(i).getPrn() == p) {
				printStudent(i);
				System.out.println("\nEnter New Name: ");
				String n = scan.next();
				System.out.println("Enter New Marks: ");
				double m = scan.nextDouble();
				Student s = new Student(p, n, m);
				studentDatabase.set(i, s);
				return;
			}
		}

	}
}