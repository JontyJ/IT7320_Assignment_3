package Assignment3.Part1;

public class ComputeImplementation implements ICompute {

	ICompute obj;
	
	public int squareVar(int var) {
		// TODO Auto-generated method stub
		return obj.squareVar(var);
	}

	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		return obj.multiply(x, y);
	}

	public void setObj(ICompute obj) {
		this.obj = obj;
	}
}
