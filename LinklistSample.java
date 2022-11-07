

import java.util.*;

class sampleClass{
	int x;
}


public class LinklistSample{
	public static void main(String[] args) {


		LinkedList<String> names = new LinkedList<String>();//creating a new linkedlist
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i < 3){
			System.out.println("Enter name");
			String myName = sc.nextLine();
			names.add(myName);
			i++;
		}
		

		System.out.println("Last item is: " + names.getLast());
	}
}