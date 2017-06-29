package inheritance;

public class Parent extends SuperParent{
		public static void add(String one, String two) {
			System.out.println(one + two);
		}
		public static void sub(int one, int two) {
			System.out.println(one - two);
		}
		public static void multi(int one, int two, String three) {
			System.out.println(one * two + three);
		}
		public static void div(int one, int two) {
			System.out.println(one / two);
		}

}
