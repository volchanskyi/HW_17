package age;
import java.text.*;
import java.util.Date;

public class FP {
	static String c_model = "Mercedes-Benz 300 SL";
	static String d_production = "06/35/1954";
	
	static void print(String param) {
		System.out.println(param);
	}
	
	static long age(String param) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
		Date date = f.parse(param);
		
		long dop_ms = date.getTime();
		
		long now_ms = System.currentTimeMillis();
		
		return (now_ms - dop_ms) / 31_556_952_000L;
	}
	
	public static void main(String[] args) throws ParseException {
		print("Name: " + c_model + "; Age: " + age(d_production));
		
	}

}
