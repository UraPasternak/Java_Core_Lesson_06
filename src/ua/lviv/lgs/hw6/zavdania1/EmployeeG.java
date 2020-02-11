package ua.lviv.lgs.hw6.zavdania1;

public class EmployeeG implements Salary {

	private String name;
	private int stavka;
	private int dni;

	public EmployeeG(String name, int stavka, int dni) {
		super();
		this.name = name;
		this.stavka = stavka;
		this.dni = dni;
	}

	@Override
	public void salary() {
		System.out.println("Працівник " + name + " заробив: " + (stavka / 30 * dni) + "грн");
	}
}
