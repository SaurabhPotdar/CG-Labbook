package cmom.cg.Interface;

public class D extends C implements A,B{

	public D() {
		super();
	}
	
	@Override
	public int multiply(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int addNumber(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public double divideNumber(double num1, double num2) {
		return num1/num2;
	}

}
