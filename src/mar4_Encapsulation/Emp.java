package mar4_Encapsulation;

public class Emp {

	private int salary;
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	private String dept;
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return this.dept;
	}
	
	
	private String room;
	public void setRoom(String room) {
		this.room = room;
	}
	
	public String getRoom() {
		return this.room;
	}

	
	private int labs;
	public void setLabs(int labs) {
		this.labs = labs;
	}
	
	public int getLabs() {
		return this.labs;
	}
	
	private int bonus;
	public void setBonus(int bonus) {
		this.bonus = this.salary * bonus/100;
	}
	public int getBonus() {
		return bonus;
	}
	
	
	
	
	
	
	
	
	
	
}
