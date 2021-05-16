package empWageBuilder;

public class EmpWage {
	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;
		int WAGE_PER_HR=20;
		int empHr=0;
		int dailyWage=0;
		

		System.out.println("Wellcome to the Employee Wage computation program.");
		
		int checkEmp = (int) (Math.random()*3);
		
		if (checkEmp==IS_FULL_TIME) {
			
			empHr=8;
		} else if (checkEmp==IS_PART_TIME) {
			empHr=4;
		}
		else {
			
			empHr=0;
		}
		dailyWage=empHr*WAGE_PER_HR;
		System.out.println("Daily wage = "+dailyWage);
	
		
	}
}
