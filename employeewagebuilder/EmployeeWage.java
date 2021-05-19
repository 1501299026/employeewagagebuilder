package employeewagebuilder;
import java.util.Random;
import java.util.scanner;
public class EmployeeWage {

	public class EmpWage{
		 static final int IS_FULL_TIME = 1;
		    static final int IS_PART_TIME = 2;
		    static final int EMP_RATE_PER_HRS = 20;
		    static final int NUM_OF_WORKING_DAYS = 20;
		    static final int MAX_HRS_IN_MONTH = 100;

		    public static int computeEmpWage() {
		        int empHrs = 0;
		        int empWage = 0;
		        int totalEmpHrs = 0;
		        int totalEmpWage = 0;
		        int totalWorkingDays = 0;
		        while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
		                totalWorkingDays < NUM_OF_WORKING_DAYS) {

		    private static final int IS_PART_TIME=1;
		    private static final int IS_FULL_TIME=2;

		    private final String company;
		    private final int empRatePerHour;
		    private final int maxHoursPerMonth;
		    private final int numOfWorkingDays;


		    public EmpWage(String company, int empRatePerHour, int maxHoursPerMonth, int numOfWorkingDays)
		    {

		        this.company = company;
		        this.empRatePerHour = empRatePerHour;
		        this.maxHoursPerMonth = maxHoursPerMonth;
		        this.numOfWorkingDays = numOfWorkingDays;
		    }

		    private int computeEmpWage()

		    {
		        int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;


		        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
		        {
		            totalWorkingDays++;
		            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		            switch (empCheck) {
		                case IS_PART_TIME:
		                    empHrs = 8;
		            int attendance=(int)(Math.random()*3);
		            switch(attendance)
		            {
		                case IS_FULL_TIME:empHrs=8;
		                    break;
		                case IS_PART_TIME:empHrs=8;
		                    break;
		                case IS_FULL_TIME:
		                    empHrs = 8;
		                default:empHrs=0;
		                    break;
		                default:
		                    empHrs = 0;
		            }
		            totalEmpHrs += empHrs;
		            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
		            totalEmpHrs=(totalEmpHrs+empHrs);
		            System.out.println("Days= "+ totalWorkingDays+ " Emp Hr: "+empHrs);
		        }
		        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HRS;
		        System.out.println("Total Emp Wage: " + totalEmpWage);
		        return totalEmpWage;


		        return totalEmpHrs*empRatePerHour;

		    }

		    public static void main(String[] args) {
		        System.out.println("Welcome to emp wage computation ");
		        computeEmpWage();
		    public static void main(String[] args)
		    {
		        System.out.println("Welcome to the Employee Wage Computation program");
		        //created object for company dmart
		        EmpWage  dmart=new EmpWage("Dmart",20,20,10);
		        System.out.println("Total Employee Wage for Company "+ dmart.company+" is: "+dmart.computeEmpWage());
		        //created object for company realince
		        EmpWage  reliance=new EmpWage("Reliance",10,2,20);
		        System.out.println("Total Employee Wage for Company "+ reliance.company+" is: "+reliance.computeEmpWage());=-
	}

	}


