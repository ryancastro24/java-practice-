import java.io.*;
import java.util.*;


public class FileReaderSample{
	public static void main(String[] args) {
		try{
			File obj = new File("ryan.txt");
			Scanner sc = new Scanner(obj);
			while(sc.hasNextLine()){
				String data = sc.nextLine();
				System.out.println(data);
				}

			sc.close();
		}//end of try statement

		catch(FileNotFoundException e){
			System.out.println("Error has occured!");
			e.printStackTrace();
		}
	}
}