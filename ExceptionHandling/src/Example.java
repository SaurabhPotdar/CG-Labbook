
public class Example {

	public void ThrowsExample(int n) throws ArrayIndexOutOfBoundsException,ArithmeticException{
		if(n==0)
			throw new ArithmeticException("Arithmetic exception in ThrowsExample");
		else if(n==3)
			throw new ArrayIndexOutOfBoundsException("Index out of bound exception in ThrowsExample()");
	}
	
	public void ThrowExample(int n) {
		try {
			int j = 10/n;
			System.out.println("No exception in ThrowExample()");
		}
		catch(ArithmeticException e){
			System.out.println("Exception in ThrowExample()");
		}
	}
	
	public void getData(double numOne, double numTwo) {
		if(numTwo==0)
			throw new ArithmeticException("Divide by zero exception");
		double result = numOne/numTwo;
		System.out.println(result);
	}
	
}
