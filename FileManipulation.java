import java.io.*;
import java.util.*;


public class FileManipulation{
	public static void main(String[] args) {
		File obj = new File("ryan.txt");
		if(obj.exists()){
			System.out.println(obj.getName());
			System.out.println(obj.getAbsolutePath());
			System.out.println(obj.canRead());
			System.out.println(obj.canWrite());
		}
	}
}