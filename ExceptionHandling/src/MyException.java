
//Custom Exception

class MyException extends Exception{
   
	String str1;
   
	MyException(String str2) {
		this.str1=str2;
   }
   
	public String toString(){ 
		return ("My custom exception "+str1) ;
	}
   
}
