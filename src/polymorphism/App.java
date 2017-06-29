package polymorphism;

public class App extends Parent{
	
	public void move() {
		System.out.println("This is child class from poly~ package");
	} 
	public void first() {
		this.move();
	}
	public void second() {
		super.move();
	}
	public static void add(int fir, int sec) {
		System.out.println("*********Start" + "\n" + "Sum = " + (fir + sec) +  "\n" + ":: entered 3 params" + "\n" + "first - " + fir + "\n" + "second - " + sec + "\n" + "##########End");
	}
	
	public static void add(int fir, int sec, int thi) {               
		System.out.println("*********Start" + "\n" + "Sum = " + (fir + sec + thi) +  "\n" + ":: entered 3 params" + "\n" + "first - " + fir + "\n" + "second - " + sec + "\n" + "third - " + thi + "\n" + "##########End");
	}                                                    
	
	public static void add(int fir, int sec, int thi, int fou) {               
		System.out.println("**********Start" + "\n" + "Sum = " + (fir + sec + thi + fou) + "\n" + ":: entered 4 params" + "\n" + "first - " + fir + "\n" + "second - " + sec + "\n" + "third - " + thi + "\n" + "fourth - " + fou + "\n" + "##########End" );
	}                                                    

	public static void main(String[] args) {
		System.out.println("Example of overriding" + "\n" + "************Start" );  
		new App().first();
		new App().second();
		System.out.println("##########End" + "\n" + "Example of overloading"); 
		add(13, 16);
		add(13, 43, 45);
		add(5, 6, 9, 56);
		
	}

}
