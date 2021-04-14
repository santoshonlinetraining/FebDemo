package feb24;

public class Emp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp3 obj = new Emp3();
		int result = obj.add(10,  20, 30);
		System.out.println(result);
		System.out.println(obj.add(1111, 222, 333));
		
		int AccountBalance;
		int roi;
		
		AccountBalance = 5000;
		roi = 6;
		
		int interestAmount = obj.interest(AccountBalance, roi);
		int TotalAmount = AccountBalance + interestAmount;
		
		System.out.println("Total account balance after ROI " + TotalAmount );
	}
	
	int add(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}
	
	int interest(int amount, int roi) {
		int result;
		result = amount * roi/100;
		
		return result;
	}
	
		

}
