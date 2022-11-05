
import java.util.*;// importing  java util package

public class IteratorSample{
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList<String>();
		names.add("Ryan");
		names.add("Anna");
		names.add("Patrick");
		names.add("Tomas");
		//creating an iterator of the array list names
		Iterator<String> myNames = names.iterator();

		while(myNames.hasNext()){
			String a = myNames.next();
			if(a.charAt(0) == 'R'){
				myNames.remove();
			}


		}

		for(String finalnames : names){
			System.out.println(finalnames);
		}

	}
}