package feb25;

import feb24.Emp2;

public class Emp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp3 obj = new Emp3();
		
		int AccountBalance = 6000;
		int ROI = 5;
		
		int interestAmount  = obj.interest(AccountBalance, ROI);
		int TotalAmount = AccountBalance + interestAmount;
		
		System.out.println("Total amount after ROI " + TotalAmount);
		
		
		Emp2 obj1 = new Emp2();
		obj1.add();
		
	}

}
