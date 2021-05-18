package employeewagebuilder;
import java.util.Random;
import java.util.scanner;
public class EmployeeWage {

	public static void main(String[] args) {

		public static void main(String[] args)
		static int WAGEPERHR;
		static int MAXWORKINGHRS;
		static int MAXWORKINGDAYS;
		static int HALFDAYWORKINGHRS;
		static int FULLDAYWORKINGHRS;
		static String COMPANY_NAME;

		static int totalWorkingHrs=0;

		public EmloyeeWage()
		{	
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Company Name : ");
			COMPANY_NAME=scan.next();
			System.out.println("Enter the Companie's Maximun Working Days in a Month: ");
			MAXWORKINGDAYS=scan.nextInt();
			if(MAXWORKINGDAYS>31 || MAXWORKINGDAYS <1) 
				System.out.println("Invalid Input Default Maximum Working Day in Month Set to 20 Day");
			System.out.println("Enter Maximun Working Hours In a Month : ");
			MAXWORKINGHRS=scan.nextInt();
			System.out.println("Enter Half Day Working Hours : ");
			HALFDAYWORKINGHRS=scan.nextInt();
			System.out.println("Enter Full Day Working Hours : ");
			FULLDAYWORKINGHRS=scan.nextInt();
			System.out.println("Enter the Companie's Wage Per Hour : ");
			WAGEPERHR=scan.nextInt();		
		}


		static void attendanceSheet()
		{
			System.out.println("Welcome to Employee Wage Builder");
			Random rand = new Random();
			int WAGEPERHR=20;
			int totalWorkinghr=0;
			for(int day=1;day<=20;day++)


			for(int day=1;day<=MAXWORKINGDAYS;day++)
			{			
				int attendance=rand.nextInt(3);				

				switch(attendance);
				attendance();
				if (totalWorkingHrs>=MAXWORKINGHRS)
				{
					case 0:
							totalWorkinghr+=0;
							break;
					case 1:
							totalWorkinghr+=4;
							break;
					case 2:
							totalWorkinghr+=8;
				}

				if (totalWorkinghr>=100)
				{
					totalWorkinghr=100;
					totalWorkingHrs=MAXWORKINGHRS;
					break;
				}
			}

			System.out.println("Employee Earn : $" + totalWorkinghr*WAGEPERHR + " This Month." );


		}

		static void attendance()
		{
			Random rand = new Random();
			int attendance=rand.nextInt(3);				
			final int halfDay=1,fullDay=2;
			switch(attendance)
			{
				case halfDay:
					totalWorkingHrs+=HALFDAYWORKINGHRS;
					break;
				case fullDay:
					totalWorkingHrs+=FULLDAYWORKINGHRS;
			}
		}

		static void calculateSalary()
		{
			System.out.println("\nWelcome to Employee Wage Builder of "+COMPANY_NAME);
			attendanceSheet();
			System.out.println("Employee Earn : $" + totalWorkingHrs*WAGEPERHR + " This Month." );		
		}

		public static void main(String[] args)
		{
			EmloyeeWage Dmart=new EmloyeeWage();
			Dmart.calculateSalary();
	}

	}


