package ua.lviv.lgs.hw6.zavdania1;

public class EmployeeM implements Salary {

	private String name;
	private int stavka;

	public EmployeeM(String name, int stavka) {
		super();
		this.name = name;
		this.stavka = stavka;
	}

	@Override
	public void salary() {
		System.out.println("Працівник " + name + " заробив: " + stavka + "грн");
	}

}
