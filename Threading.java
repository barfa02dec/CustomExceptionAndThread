package practice.thrade;

// class for test run() and start()
public class Threading {

	public static void main(String []s) {
		TestStartMethod obj1 = new TestStartMethod();
		TestRunMethod obj2 = new TestRunMethod();
		
		obj1.start();//start() create new thread,call and execute run method in new thread 
		try {Thread.sleep(10);}catch(Exception e) {}
		obj2.run();//run method logic execute in same thread

	}

}

//class for test run method execute in new thread
class TestStartMethod extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("start "+i);
			try {Thread.sleep(10);}catch(Exception e) {}
		}
	}
}

//class for test run method execute in same thread
class TestRunMethod extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("run "+i);
			try {Thread.sleep(10);}catch(Exception e) {}
		}
	}
}



