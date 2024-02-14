package assignment3_part1;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Functions function = new Functions();
		int choice;

		do {
			System.out.println("----Student Details Manager----");
			System.out.println("\n1. Add Student");
			System.out.println("\n2. Delete Student");
			System.out.println("\n3. Search Student");
			System.out.println("\n4. Update Student");
			System.out.println("\n5. Print Student Details");

			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

			choice = scan.nextInt();

			switch (choice) {
			case 1:
				function.addStudent();
				break;

			case 2:
				function.deleteStudent();
				break;

			case 3:
				function.searchStudent();
				break;

			case 4:
				function.updateStudent();
				break;

			case 5:
				function.printStudentDetails();
				break;
			}// end switch-case

		} while (choice > 5); // end do-while

	}// end main

}