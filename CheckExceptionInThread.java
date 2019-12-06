package practice.thrade;

//class for test exception in same thread and in multiple thread
public class CheckExceptionInThread {

	public static void main(String[] args) {
		//Exception in multiple thread
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();
		
		//Exception in same thread
		Test1 obj1 = new Test1();
		Test1 obj2 = new Test1();
		Test1 obj3 = new Test1();
		obj1.check();
		obj2.check();
		obj3.check();
	}

}

//Class extends Thread for create new thread
class Thread1 extends Thread{
	
	//Override run method for execute logic in separate thread
	@SuppressWarnings("null")
	@Override
	public void run() {
		try{
			String  s = null;
			System.out.println(s.toLowerCase());//Generate exception
		}catch (ArithmeticException e) {
			System.out.println("Arithmatic Exception");
		}
		super.run();
	}
	
}

//Class extends Thread for create new thread
class Thread2 extends Thread{

	//Override run method for execute logic in separate thread
	@Override
	public void run() {
		try{
			System.out.println(1/0);	
		}catch (NullPointerException npe) {
			System.out.println("Null pointer Exception");
		}
		super.run();
	}
}

//Class extends Thread for create new thread
class Thread3 extends Thread{

	//Override run method for execute logic in separate thread
	@Override
	public void run() {
		try{
			int arr[] = new int[2];
			arr[3] = 10;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bond Exception");
		}
		super.run();
	}
}


class Test1{
	
	//Method for check exception
	@SuppressWarnings("null")
	public void check() {
		try{
			String  s = null;
			System.out.println(s.toLowerCase());
		}catch (ArithmeticException e) {
			System.out.println("Arithmatic exception");
		}
	}
}

class Test2{
	//Method for check exception
	public void check() {
		try{
			System.out.println(1/0);
		}catch (NullPointerException e) {
			System.out.println("Null Pointer Exception");
		}
	}
}

class Test3{
	//Method for check exception
	public void check() {
		try{
			int arr[] = new int[2];
			arr[3] = 10;
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bond Exception");
		}
	}
}

