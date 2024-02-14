package assignment3_part1;

public class Student {

	private int prn;
	private String name;
	private String dob;
	private double marks;

	public Student(int prn, String name, String dob, double marks) {
		super();
		this.setPrn(prn);
		this.setName(name);
		this.setDob(dob);
		this.setMarks(marks);
	}

	// To String

	@Override
	public String toString() {
		return "PRN : " + prn + ", Name: " + name + ", Marks: " + marks + "]\n";
	}

	// Constructors
	public Student(int prn, String name) {
		this.prn = prn;
		this.name = name;
	}

	public Student(int prn, String name, double marks) {

		this(prn, name);
		this.marks = marks;
	}

	// Getter and Setters

	public int getPrn() {
		return prn;
	}

	public void setPrn(int prn) {
		this.prn = prn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}