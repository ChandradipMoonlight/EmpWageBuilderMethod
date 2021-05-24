package empWageBuilder;

public class EmpWage {
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	
	private final  String company;
	private final int empRatePerHr;
	private final int maxWorkingDays;
	private final int maxWorkingHrPerMonth;
	private int totalEmpWage;
	
	public EmpWage(String company, int empRatePerHr, int maxWorkingDays, int maxWorkingHrPerMonth) {
		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHrPerMonth = maxWorkingHrPerMonth;
	}
	public void calculateEmpWageForCompany() {
		int totalWorkingDays=0;
		int totalHr=0;
		int empHr;
		while (totalWorkingDays<maxWorkingDays && totalHr<maxWorkingHrPerMonth) {
			empHr=0;
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
		
		int dailyWage=empHr*empRatePerHr;
		System.out.println("Daily Wage ="+dailyWage);
		
		}
		totalEmpWage=totalHr*empRatePerHr;
		System.out.println("Total Employee Wage for company:"+company+" is "+totalEmpWage);
	}
	public static void main(String[] args) {
		EmpWage dMart = new EmpWage("DMart", 50, 5, 26);
		EmpWage reliance = new EmpWage("reliance", 20, 5,25);
		dMart.calculateEmpWageForCompany();
		reliance.calculateEmpWageForCompany();
	}
}
