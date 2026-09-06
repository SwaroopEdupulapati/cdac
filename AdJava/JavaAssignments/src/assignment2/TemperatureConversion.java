package assignment2;

public class TemperatureConversion {
	public static float convertTemp(float c) {
		return (c*9/5)+32;
	}

	public static void main(String[] args) {
		float converted = convertTemp(40);
		if(converted > 100) {
			System.out.println("The temperature is more : " + converted);
		}
		else {
			System.out.println(converted);
		}
	}
}
