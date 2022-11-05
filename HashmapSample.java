import java.util.*;

public class HashmapSample{
	public static void main(String[] args) {
		HashMap<String,String> names = new HashMap<String,String>(); // creating new hash map
		HashMap<Integer,String> players = new HashMap<Integer,String>();

		names.put("Manager", "Ryan Joel Castro");
		names.put("Team Leader", "Anne Marie");
		names.put("Employee", "Patric Star");

		System.out.println(names);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players: ");

		int n = sc.nextInt();
 

		int count = 0;

		for (int i = 0; i < n  ; i++) {
			count++;
			
			System.out.println("Enter first name:");
			String  fname = sc.nextLine();
			
			players.put(count,fname);
		}

		System.out.print(players);

	}//end of main 

}