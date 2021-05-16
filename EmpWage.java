package empWageBuilder;

public class EmpWage {
	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		int WAGE_PER_HR=20;
		int emphr=0;
		int dailyWage=0;
		

		System.out.println("Wellcome to the Employee Wage computation program.");
		
		int checkEmp = (int) (Math.random()*2);
		
		if (checkEmp==IS_FULL_TIME) {
			System.out.println("Employee is Present");
			emphr=8;
		} else {
			System.out.println("Employee is Absent");
			emphr=0;
		}
		dailyWage=emphr*WAGE_PER_HR;
		System.out.println("Daily wage = "+dailyWage);
	
		
	}
}
