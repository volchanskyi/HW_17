package age;
import java.text.*;

public class PP {           
		public static void main(String args[]) throws ParseException {                     //main method 
			System.out.println("This is an example of PROCEDURAL PROGRAMMING");
			System.out.println("Name of the best selling album of ZZ TOP: ");                                                  //Printing label: Name of the best selling album of ZZ TOP:
			System.out.println("Eliminator");	                                       //Printing name
			System.out.println("; ");                                                      //Printing delimiter
			System.out.println("Was released : ");                                                   //Printing label: Was released
			System.out.println((System.currentTimeMillis() - new SimpleDateFormat("MM/dd/yyyy").parse("03/23/1983").getTime()) / 31_556_952_000L + " years ago"); //Printing Age
		}																								//Main Method

}																										//Class
