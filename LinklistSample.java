

import java.util.*;

class sampleClass{
	int x;
}


public class LinklistSample{
	public static void main(String[] args) {


		LinkedList<String> names = new LinkedList<String>();//creating a new linkedlist
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("Enter name");
			String myName = sc.nextLine();
			names.add(myName);
			System.out.println(names);
		}
		


	}
}