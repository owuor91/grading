package grading;

import java.util.Scanner;
public class grades {

	public static void main(String[] args) {
		Scanner gradescan = new Scanner(System.in);
		System.out.println("Welcome, Enter student's mark");
		int mark = gradescan.nextInt();
		
		String grade ="";
		String perf="";
		int ranging=100;
		
		if(mark <0 || mark >100){
			System.out.println("Input out of range");
			ranging =101;
		}
		
		else if(mark > 80){
			grade = "A";
			perf = "Passed"	;	
		}
		else if(mark >70 && mark <81){
			grade = "B";
			perf = "Passed"	;
		}
		else if(mark >60 && mark <71){
			grade = "C";
			perf = "Passed"	;		
		}
		else if(mark >=50 && mark <61){
			perf = " had Average performance in"
					+ ""	;		
		}
		else if(mark <50){
			perf = "Failed";
		}
		else{
			System.out.println("Invalid input exiting...");
		}
		
		if(ranging ==100 ){
			System.out.println("The student scored "+ mark);
			if(mark >60){
			System.out.println("The student had grade "+ grade);
			}
			System.out.println("The student "+ perf +" the exam");
		}
	}

}
