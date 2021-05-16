package empWageBuilder;

public class EmpWage {
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HR=20;
	public static final int MAX_WORKING_DAYS=20;
	
	public static void main(String[] args) {
		
		int empHr=0;
		int dailyWage=0;
		int totalWage=0;
		

		System.out.println("Wellcome to the Employee Wage computation program.");
		
		
		for (int i =1; i<=MAX_WORKING_DAYS; i++) {
			
			int checkEmp = (int) (Math.random()*3);
			
		switch (checkEmp) {
		case IS_FULL_TIME :
			empHr=8;
			break;
		case IS_PART_TIME :
			empHr=4;
			break;
		default :
			empHr=0;
		}
		
		dailyWage=empHr*WAGE_PER_HR;
		totalWage += dailyWage;
		
		}
		System.out.println("Total wage for month = "+totalWage);
	}
	
}
