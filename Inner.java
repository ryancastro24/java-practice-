
class OuterClass{
	int x = 22;
	String out = "the outer class!";
	class InnerClass{
		public int innerClassMethod(){
			return x;
		}
	}
}






public class Inner{
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass(); // calling the outer class
		OuterClass.InnerClass myInner = myOuter.new InnerClass(); // calling the inner class
		System.out.println(myInner.innerClassMethod());
		System.out.println(myOuter.out);

	}
}