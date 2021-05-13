package employeewagebuilder;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Employee");
		Random rand = new Random();
		int attendance=rand.nextInt(2);
		if (attendance==0)
			System.out.println("Employee is Absent");
		else
			System.out.println("Employee is Present");
	}

	}

}
