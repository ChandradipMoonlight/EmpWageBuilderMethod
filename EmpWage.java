package empWageBuilder;

public class EmpWage {
	public final  String company;
	public int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;
	
	public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
		
		public void setTotalEmpWage(int totalEmpWage) {
			this.totalEmpWage = totalEmpWage;
		}
		@Override
		public String toString() {
			return "Total Emp Wage for company: "+company+" is: "+totalEmpWage;
		}
		public static void main(String[] args) {
			EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
			empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
			empWageBuilder.addCompanyEmpWage("Reliance", 10, 5, 20);
			empWageBuilder.computeEmpWage();
		}
}