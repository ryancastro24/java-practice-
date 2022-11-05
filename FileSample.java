import java.io.*;



public class FileSample{
	public static void main(String[] args) {
		
		try{
		FileWriter writer = new FileWriter("ryan.txt");
		writer.write("Hello world this is new!");
		writer.close();
		System.out.println("Succesfully written");
		}//end of try statement
		catch(IOException e){
			System.out.println("Something error occured");
			e.printStackTrace();
		}
	}
}