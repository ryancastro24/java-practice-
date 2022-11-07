
import  java.util.*;




public class Main{

	public static void myMethod(){
		System.out.println("hello world");
	}


	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap<String, String> students = new HashMap<String,String>(); // this is to create new array list
	int i = 0;

	while(i < 3){
		System.out.println("Enter ID");
		String id = sc.nextLine();
		System.out.println("Enter Name");
		String name =  sc.nextLine();

		students.put(id, name);
	i++;
}

	for(String  j : students.keySet()){
		System.out.println("key: " + j + " value: " + students.get(j));
	}

}//end of main method
}