


class Sample{
	 static void sampleMethod(){
		System.out.println("hello world!");
	}
}



public class TryCatchSample{


	public static void main(String[] args) {
	

		Sample mySample = new Sample();

		mySample.sampleMethod();



		try{
			int[] num = {1,2,3};
			System.out.println(num[0]);
		}
		catch(Exception e){
			System.out.println("Something error happened!");
		}
		finally{
			System.out.println("code done running!");
		}
	}

}