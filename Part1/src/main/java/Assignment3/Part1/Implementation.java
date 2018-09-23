package Assignment3.Part1;

public class Implementation implements Compute{
	
	Compute obj;

	public int computeTax(int amount) {
		return obj.computeTax(amount);
	}

	public int weeklySalary(Employee emp) {
		return obj.weeklySalary(emp);
	}

	public int fortnightSalary(Employee emp) {
		return obj.fortnightSalary(emp);
	}

	public double computeKiwiSaver(Employee emp) {
		return obj.computeKiwiSaver(emp);
	}
	
	public void setObj(Compute obj) {
		this.obj = obj;
	}
}
