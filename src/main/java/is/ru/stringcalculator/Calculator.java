package is.ru.stringcalculator;

import java.util.*;

public class Calculator {
	
	public static int add(String text) {
		int total = 0;
		String delimiter = "\n";
		
		if(text.startsWith("//")) {
			delimiter = text.substring(2, 3);
			text = text.substring(4);
		}
		
		if (!text.equals("")){
			if(text.contains(",") || text.contains(delimiter)) {
				String numbers[] = text.split(",|" + delimiter);
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
		ArrayList<String> negNum = new ArrayList<String>();
		String message = "Negatives not allowed: ";
		
		for(String number : numbers){
			if(toInt(number) < 0){
				negNum.add(number);
			}
			else if(toInt(number) < 1001){
				total += toInt(number);
			}
		}
		if(!negNum.isEmpty()) {
			throw new RuntimeException(message + negNum);
		}
		else {
			return total;
		}			
	}
}
