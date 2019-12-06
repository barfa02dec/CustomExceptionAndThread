package practice.exception;


//Class for Custom exception extend Exception
@SuppressWarnings("serial")
class CustomException extends Exception{
	
	//Constructor gives appropriate message
	public CustomException(String message) {
		super(message);
	}
} 

@SuppressWarnings("null")
public class TestCustomException {
	
	public static void main(String []agrs) throws CustomException{
		try {
			System.out.println(1/0);
		}catch(ArithmeticException ae) {
			//System.out.println(new CustomException("Can not divide by zero"));
		}
		
		try {
			String s = null;
			System.out.println(s.toLowerCase());
		}catch(NullPointerException npe) {
			throw new CustomException("Can not convert 'null' into lower case");
		}
		System.out.println("ABab");//This statement not execute if NullPointerException occurs cause of throw exceptoin
	}
	
}
