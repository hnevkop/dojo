package codingdojo;

public class StringCalculator {

	public int add(String string) {
		int default_value = 0;
		int value = countStringNumbers(string, (string.length()-1), default_value);
		return value;
	}

	/**
	 * Count the string numbers. Used recursively
	 * @param string
	 * @param position
	 * @param result
	 * @return result 
	 */
	private int countStringNumbers(String string, int position, Integer result) {
			if(position >= 0){
				char char_element = string.charAt(position);
				if(isNumberCharacter(char_element)) {					
					result =  addNextNumber(result, char_element);
				}
				result = countStringNumbers(string, position-1, result);
			}			
		
		return result;
	}

	private boolean isNumberCharacter(char char_element) {
		return  (char_element != ',' && char_element != '\n' ); 
	}
	
	private int addNextNumber(int value, char next ) {
	  return value = value + Character.getNumericValue(next); 	
	}

}
