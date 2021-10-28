package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public Double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.percentage = grossSalary * (percentage/100);
		System.out.println("Updated data: " + name + ", $ " + (netSalary() + this.percentage));
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f%n", netSalary());
	}
}
