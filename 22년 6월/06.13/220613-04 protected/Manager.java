
public class Manager extends Employee {
	private int bonus;
	
	public Manager() {
//		super();  // 부모의 기본 생성자도 자동으로 호출함. 얘도 있어야 됨.
	}
	
	public Manager(String name, String address, int salary, int RRN, int bonus) {
		super(name, address, salary, RRN);
		this.bonus = bonus;
	}
	
	public void printSalary() {
		System.out.println(name + "(" + address + "): " 
								+ (salary + bonus));
	}
	
	public void printRRN() {
//		System.out.println(RRN);  // private이라 바로 접근 불가
	}
}
