package empWageBuilder;

import java.util.Scanner;

public class EmpWageBuilderForCompany {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private static String company;
	private static int wagePerHr;
	private static int maxWorkingDays;
	private static int maxHrPerMonth;

	public EmpWageBuilderForCompany(String company, int wagePerHr, int maxWorkingDays, int maxHrPerMonth) {
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.maxWorkingDays = maxWorkingDays;
		this.maxHrPerMonth = maxHrPerMonth;
	}

	private int calculateEmpWageForCompany() {

		int totalWage = 0;
		int totalWorkingDays = 0;
		int totalHr = 0;

		while (totalWorkingDays < maxWorkingDays && totalHr < maxHrPerMonth) {
			int empHr = 0;
			totalWorkingDays++;

			int checkEmp = (int) (Math.random() * 3);

			switch (checkEmp) {
			case IS_FULL_TIME:
				empHr = 8;
				break;
			case IS_PART_TIME:
				empHr = 4;
				break;
 			default:
				empHr = 0;
			}
			totalHr += empHr;

			int dailyWage = empHr * wagePerHr;
			System.out.println("Daily Wage =" + dailyWage);

		}
		totalWage = totalHr * wagePerHr;
		System.out.println("Total Employee Wage for company : " + company + " is " + totalWage);
		return totalWage;
	}

	public static void main(String[] args) {
		System.out.println("Wellcome to the Employee Wage computation program.");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the company name : ");
		String companyName = sc.nextLine();
		System.out.print("Enter the Employee rate per hour : ");
		int empRate = sc.nextInt();
		System.out.print("Enter the max working days for in month : ");
		int days = sc.nextInt();
		System.out.println("Enter the max working hr in Month : ");
		int hr = sc.nextInt();
		sc.close();

		EmpWageBuilderForCompany companyDetails = new EmpWageBuilderForCompany(companyName, empRate, days, hr);
		companyDetails.calculateEmpWageForCompany();
	}
}
