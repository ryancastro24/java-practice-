

import java.util.*;


public class HashsetSample{




	public static void main(String[] args) {

	HashMap<String,String> student = new HashMap<String, String>();
	Scanner sc = new Scanner(System.in);

	

	while(true){
		System.out.println("Enter Choice");
		int choice = Integer.parseInt(sc.nextLine());


		switch(choice){
		case 1://add item in hashmap
			System.out.println("Enter ID number:");
			String id = sc.nextLine();
			if(id.length() > 9){
				System.out.println("ERROR! ID input overlapse");
				break;
			}

			System.out.println("Enter Name:");
			String name = sc.nextLine();

			student.put(id,name);
		break;

		case 2://remove item in hashmap
			System.out.println("Enter Id Number: ");
			String removeID = sc.nextLine();



			for(String i : student.keySet()){

				
				if(i.equals(removeID)) { // check if id number is in the hashmap
					student.remove(removeID);
					System.out.println(removeID + " has been successfully deleted!");
					break;
				}
				else{
					System.out.println("Cannot find ID");
				}
			
			}
		break;

		case 3: // display items in the hashmap
			for(String i : student.keySet()){
				System.out.println("ID Number: "+ i + " ______ " + "Name: " + student.get(i));
			}
		break;

		case 4: //exits the loop
			System.out.println("Thank you for using the app!");
			System.exit(1);

		break;
		default://return error message if input is invalid
			System.out.println("Invalid input!");
		break;

		}
	}


	}
}