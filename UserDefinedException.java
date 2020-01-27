/*
User Defined Exception
*/
import java.util.Scanner;
class SalaryException extends Exception{
	String msg;
	SalaryException(){
		msg="Salary Exception : Salary is Zero";
	}	
	public String getMessage(){
		return msg;
	}
}
class Salary{
	public static void main(String as[]){
		Scanner sc=new Scanner(System.in);
		int emp_id;
		double ba,da=0,hr=0,total=0,tax=0;
		System.out.println("Enter the employee ID");
		emp_id=sc.nextInt();
		System.out.println("Enter the basic salary");
		ba=sc.nextDouble();
		da=ba*0.50;
		hr=ba*0.20;
		total=ba+da+hr;
		try{
			if(total==0){
				throw new SalaryException();
			}
			if(total<500000){
				tax=0;
			}
			else if(total>=500000){
				tax=total*0.10;
			}
			total=total-tax;
			System.out.println("Emp_ID      B.A.      D.A.      H.R.A                   Total");
			System.out.println(emp_id+"     "+ba+"    "+da+"    "+hr+"    "+total);
				
		}catch(SalaryException e){
			System.out.println(e.getMessage());
		}		
	}
}