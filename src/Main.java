public class Main {
	public static void main(String[] arguments) {
		float fah = 86;
		System.out.println(fah + " degrees Fahrenheit is ...");
		// To convert Fahrenheit into Celsius begin by subtracting 32
		fah = fah - 32;/* w w w . java 2s. c om */
		// Divide the answer by 9
		fah = fah / 9;
		// Multiply that answer by 5
		fah = fah * 5;
		System.out.println(fah + " degrees Celsius\n");

		float cel = 33;
		System.out.println(cel + " degrees Celsius is ...");
		// To convert Celsius into Fahrenheit begin by multiplying by 9
		cel = cel * 9;
		cel = cel / 5; // Divide the answer by 5
		cel = cel + 32;
		System.out.println(cel + " degrees Fahrenheit");
	}
}