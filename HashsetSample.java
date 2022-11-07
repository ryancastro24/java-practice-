

import java.util.*;


public class HashsetSample{




	public static void main(String[] args) {

	HashMap<String,String> student = new HashMap<String, String>();
	Scanner sc = new Scanner(System.in);

	

	while(true){
		System.out.println("Enter Choice");
		int choice = Integer.parseInt(sc.nextLine());


		switch(choice){
		case 1:
			System.out.println("Enter ID number:");
			String id = sc.nextLine();
			System.out.println("Enter Name:");
			String name = sc.nextLine();

			student.put(id,name);
		break;

		case 2:
			System.out.println("Enter Id Number: ");
			String removeID = sc.nextLine();

			student.remove(removeID);
		break;

		case 3:
			for(String i : student.keySet()){
				System.out.println("ID Number: "+ i + " ______" + "Name: " + student.get(i));
			}
		break;

		case 4:
			System.out.println("Thank you for using the app!");
			System.exit(1);

		break;
		default:
			System.out.println("Invalid input!");
		break;

		}
	}


	}
}