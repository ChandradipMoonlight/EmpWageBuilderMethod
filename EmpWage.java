package empWageBuilder;

public class EmpWage {
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;

	
	public static int calculateEmpWageForCompany(String company, int wagePerHr, int maxWorkingHr, int maxWorkingDays) {
		
		int totalWage=0;
		int totalWorkingDays=0;
		int totalHr=0;
		

		System.out.println("Wellcome to the Employee Wage computation program.");
		
		
		
		while (totalWorkingDays<maxWorkingDays && totalHr<maxWorkingHr) {
			int empHr=0;
			totalWorkingDays++;
			
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
		totalHr += empHr;
		
		int dailyWage=empHr*wagePerHr;
		System.out.println("Daily Wage ="+dailyWage);
		
		}
		totalWage=totalHr*wagePerHr;
		System.out.println("Total Employee Wage for company:"+company+" is "+totalWage);
		return totalWage;
		
		
	}
	
	
	public static void main(String[] args) {
		calculateEmpWageForCompany("Demart", 100, 208, 26);
		calculateEmpWageForCompany("Reliance", 120, 208, 26);
		calculateEmpWageForCompany("zfTech", 150, 200, 25);
		
		
		
	}
	
}
