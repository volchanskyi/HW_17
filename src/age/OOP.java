package age;

import java.text.*;
import java.util.Date;

public class OOP {
	String name = "BMW 507";
			String dob = "11/21/1954";
	
	void print(String param) {
		System.out.println(param);
	}
	
	long age(String param_dob) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
		Date date = f.parse(param_dob);
		long dob_ms = date.getTime();
		
		long now_ms = System.currentTimeMillis();
		return (now_ms - dob_ms) / 31_556_952_000L;
	}
	
	
	public static void main(String[] args) throws ParseException {
		OOP o = new OOP();
		o.print("Name: " + o.name + "; Age: " + o.age(o.dob));

	}

}
