import java.util.*;



public class ArraylistSample{
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();//creat a arraylist
		names.add("Ryan");
		names.add("Tomas");
		names.add("Anna");
		names.add("Patrick");
		System.out.println(names);
		System.out.println("Add new item in the array!");
		names.add("Putin");
		System.out.println(names);
	}
}