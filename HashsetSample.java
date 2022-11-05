

import java.util.*;


public class HashsetSample{
	public static void main(String[] args) {
		HashSet<String> colors = new HashSet<String>();//creating HashsetSample
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");

		System.out.println(colors);
		System.out.println(colors.contains("Red"));


		HashSet<Integer> num = new HashSet<Integer>(); // creating hashset integer
		num.add(1);
		num.add(2);
		num.add(7);

		for (int i = 1; i <= 10 ; i++) {
			if(num.contains(i)){
				System.out.println(i + " Is in the number list");
			}
			else{
				System.out.println(i + " Is not in the number list");
			}
		}
	}
}