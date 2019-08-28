import java.util.*;

public class Main {
	
	public static void main(String args[]){
		
		/*try {
			Class<?> t = Class.forName("MyException");  //Create object using forName
			t.toString();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
				
		try{
			System.out.println("Starting of try block");
			throw new MyException("This is My error Message");
		}
		catch(MyException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}*/
		
		/*int n=0;
		
		try {
			Example eg1 = new Example();
			eg1.ThrowsExample(n);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		Example eg2 = new Example();
		eg2.ThrowExample(n);*/
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		
		try {
			if(n<10000)
				throw new SalaryException("Salary less than 10000 Exception");
			else
				System.out.println("Valid salary");
		}
		catch(SalaryException a) {
			System.out.println(a.getMessage());
		}
		
		try {
			if(isLowerCase(s.charAt(0)))
				throw new NameException("First letter not capital Exception");
			else
				System.out.println("Name is valid");
		}
		catch(NameException b) {
			System.out.println(b.getMessage());
		}
		
		String a = "abc";
		System.out.println(a.hashCode());
		a = "bcd";
		System.out.println(a.hashCode());
		
		StringBuffer s1 = new StringBuffer("abc");
		s1.append("b");
		System.out.println(s1);
		
	}

	public static boolean isLowerCase(char c) {
		return c>='a'  && c<='z';
	}

}
