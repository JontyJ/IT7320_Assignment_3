package Assignment3.Part1;

public class Implementation implements Compute{
	
	Compute obj;

	public int computeTax(int amount) {
		return obj.computeTax(amount);
	}

	public double weeklySalary(Employee emp) {
		return obj.weeklySalary(emp);
	}

	public double fortnightSalary(Employee emp) {
		return obj.fortnightSalary(emp);
	}

	public int computeKiwiSaver(Employee emp) {
		return obj.computeKiwiSaver(emp);
	}
	
	public void setObj(Compute obj) {
		this.obj = obj;
	}
}
