import java.util.*;
interface CostCalc{		// interface to define the method of calculating the profit/loss
	public void calc();	// method template
}
class Company1 implements CostCalc{ 	// first company
	String name;			// details of comapny
	double sell, cost,profit;
	int flag=0;
	Company1(String s1, double s,double c){	// initializing the details of company
		name=s1;
		sell=s;
		cost=c;
	}
	public void calc(){		//overriding the method of interface
		if(sell>cost){
			profit=(sell-cost)/cost*100;
		}
		else{
			profit=(cost-sell)/cost*100;
			flag=1;
		}
	}
	void display(){			//displaying the profit/loss
		if(flag==0)
			System.out.println("Total Profit of "+name+" is :"+profit+"");
		else
			System.out.println("Total Loss of "+name+" is :"+profit+"%");
	}

}
class Company2 implements CostCalc{	//second company
	String name;			// details of second company
	double sell, cost,profit;
	int flag=0;
	Company2(String s1, double s,double c){		//initializing the details of second company
		name=s1;
		sell=s;
		cost=c;
	}
	public void calc(){		//overriding the method of interface to calculate profit/loss
		if(sell>cost){	
			profit=(sell-cost)/cost*100;
			flag=0;
		}
		else{
			profit=(cost-sell)/cost*100;
			flag=1;
		}
	}
	void display(){		//displaying the profit/loss of second company
		if(flag==0)
			System.out.println("Total Profit of "+name+" is :"+profit+"%");
		else
			System.out.println("Total Loss of "+name+" is :"+profit+"%");
	}

}
class TestCom{
	public static void main(String as[]){ 
	//creating objects of both company and giving the details throught parameterised constructor
		Company1 com=new Company1("Infosys",2500000,1500000);
		Company2 com2=new Company2("Wipro",650000,30000000);
		// individually calling the method using objects
		com.calc();
		com.display();
		com2.calc();
		com2.display();
	}
}