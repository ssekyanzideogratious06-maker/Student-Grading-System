package studentsgradingsystem;
import java.util.Scanner;
public class studentsgradingsystem {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int choice;
		String[]studentNames = new String[10];
		int[] studentMarks = new int[10];
		int studentCount = 0;
		do {
			System.out.println("STUDENTS GRADING SYSTEM");
			System.out.println("Welcome to Buddo Secondary School");
			System.out.printin("Please select your choice");
			System.out.println( "1.Register Student");
			System.out.println("2.Display Students");
			System.out.println("3.Exit");
			System.out.println("Entre your choice");
			 choice = input.nextInt();
			 input.nextLine(); 
	switch (choice)		 {
	case 1:
		System.out.println("Registering students");
		System.out.println("Entre student name:");
		String name = input.nextLine();
		studentNames[studentCount] = name;
		System.out.println("Entre student mark");
		int mark = input.nextInt();
		input.nextLine();
		while(mark< 0|| mark >100) {
			System.out.println("Invalid mark!");
			System.out.println("please entre mark between 0 and 100.");
			System.out.println("Entre student mark again:");
			mark = input.nextInt();
			input.nextLine();
		}
		studentMarks[studentCount] = mark;
		studentCount++;
		System.out.println("Student registered successfully !");
		break;
	case 2:
		System.out.println("Displaying students");
		for(int i = 0; i< studentCount; i++) {
			String grade;
			
			System.out.println("Student Name:" + studentNames[i]);
			System.out.println("Student Marks:" + studentMarks[i]);
			if(studentMarks[i] >=80){
				grade ="A";
				}
			else if(studentMarks[i] >=70) {
				grade = "B";
			}
			else if(studentMarks[i] >=60) {
				grade = "C";
			}
			else if(studentMarks[i] >=50) {
				grade ="D";
			}
			else {
				grade ="F";
			}
			System.out.println("Student Grade: " + grade);
			if(studentMarks[i] >=50) {
				System.out.println("Status : PASS");
				}
			else {
				System.out.println("Status : FAIL");
			}
		}
			
			
		break;
	case 3:
		System.out.println("Exit");
		break;
		default:
			System.out.println("Invalid choice.Please try again");
	}
					 
			 }while(choice!=3);
		input.close();
			
	
		
		
		
			
			
			
		}
				

}
