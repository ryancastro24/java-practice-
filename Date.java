 import java.time.*;
 import java.time.format.*;




public class Date{
 int sampleVar = 20000;

 public  void dateMethod(){
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter myYear = DateTimeFormatter.ofPattern("YY");
		DateTimeFormatter myDay = DateTimeFormatter.ofPattern("dd");
		String  year =  dt.format(myYear);
		String day = dt.format(myDay);
		System.out.println(dt);
		System.out.println(year);
		System.out.println(day);


	}

	public static void main(String[] args) {
		
		
	}
}