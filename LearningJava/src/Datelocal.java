import java.time.LocalDate;

public class Datelocal {

	public static void main(String[] args) {
		String DOB="2000-07-20";
		String arr[]=DOB.split("-");
		int age;
			int year=Integer.parseInt(arr[0]);
		int month=Integer.parseInt(arr[1]);
		int day=Integer.parseInt(arr[2]);
		
		LocalDate date = LocalDate.now();  
		System.out.println(date);
		//date.atStartOfDay();
		 int d=date.getDayOfMonth();
		 System.out.println(d);
		 int y=date.getYear();
		 System.out.println(y);
		 int m=date.getMonthValue();
		 System.out.println(m);
		
		 
		 
		 
		
		 
		 
	}

}
