package practice.thrade;

//class for test execution of single thread and multiple thread 
public class TestMultithreading {

	public static void main(String[] args) {

		//Execution logic in multiple thread
//		MultiThrad1 object = new MultiThrad1();
//		MultiThrad2 object2 = new MultiThrad2();
//		MultiThrad3 object3 = new MultiThrad3();
//		MultiThrad4 object4 = new MultiThrad4();
//		object4.start();
//		object3.start();
//		object2.start();
//		object.start();
				
		//Execution logic in single thread
//		SingleThread obj = new SingleThread();
//		obj.test1();
//		obj.test2();
//		obj.test3();
//		obj.test4();
		
	}

}

//class for create new thread for compare execution of single thread and multiple thread
class MultiThrad1 extends Thread{
	
	//Override run method for execute logic in separate thread
	@Override
	public void run() {
		for(int i =0;i<1000000;i++)
		System.out.println("thread 1   "+i);
	}
	
}

//class for create new thread
class MultiThrad2 extends Thread{

	//Override run method for execute logic in separate thread
	@Override
	public void run() {
		for(int i =0;i<1000000;i++)
			System.out.println("thread 2   "+i);
	}
	
}

//class for create new thread
class MultiThrad3 extends Thread{

	//Override run method for execute logic in separate thread
	@Override
	public void run() {
		for(int i =0;i<1000000;i++)
			System.out.println("thread 3   "+i);
	}
	
}

//class for create new thread
class MultiThrad4 extends Thread{

	//Override run method for execute logic in separate thread
	@Override
	public void run() {
		for(int i =0;i<1000000;i++)
			System.out.println("thread 4   "+i);
	}
	
}

// class for execution logic in single thread
class SingleThread{
	
	public void test1() {
		for(int i =0;i<1000000;i++)
			System.out.println("Test1   "+i);
	}
	
	public void test2() {
		for(int i =0;i<1000000;i++)
			System.out.println("Test2   "+i);
	}
	
	public void test3() {
		for(int i =0;i<1000000;i++)
			System.out.println("Test3   "+i);
	}
	
	public void test4() {
		for(int i =0;i<1000000;i++)
			System.out.println("Test4   "+i);
	}
}

