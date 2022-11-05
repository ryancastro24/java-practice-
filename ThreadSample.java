

abstract class SampleClass{
	static void sampleMethod(){}
}


class AnotherSampleClass  extends SampleClass{
	public static void sampleMethod(){
		System.out.println("Success!");
		System.out.println("Another Succes");
	}
}


//this is our main class
public class ThreadSample extends AnotherSampleClass implements Runnable{

	static int count = 0;

	public static void main(String[] args) { //this is the main program
		ThreadSample obj = new ThreadSample();
		Thread thread = new Thread(obj);
		thread.start();
		while(thread.isAlive()){
			System.out.println("Loading.....");
		}
		System.out.println("Count value is: " + count);
		count++;
		System.out.println("Count value is: " + count);

	}
	public void run(){  //this is the thread
		count++;
	}
}