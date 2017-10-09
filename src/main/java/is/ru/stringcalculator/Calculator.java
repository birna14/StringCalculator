package is.ru.stringcalculator;

public class Calculator {
	
	public static int add(String text) {
		int total = 0;
		if (!text.equals("")){
			if(text.contains(",") || text.contains("\n")) {
				String numbers[] = text.split(",|\n");
				total += sum(numbers);
			}
			else {
				total += toInt(text);
			}	
		}
		return total;
	}
	
	private static int toInt(String number) {
		return Integer.parseInt(number);
	}
	
	private static int sum(String[] numbers){
		int total = 0;
		for(String number : numbers){
			total += toInt(number);
		}
		return total; 
	}
}
