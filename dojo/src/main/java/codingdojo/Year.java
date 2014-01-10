
package codingdojo;

public class Year {
	
	int year;
	
	public Year(int year) {
		super();
		this.year = year;
	}

	public boolean isLeap() {
		
		if (isTypicalLeapYear() &&  !atypicalCommonYear()) {
			return true;
		} 		
		return false;		
	}

	private boolean isTypicalLeapYear() {
		return (year % 4) == 0;
	}

	private boolean atypicalCommonYear() {
		if( year % 100 == 0  && year % 400 != 0 ) {
			return true;
		}
		return false;
	}

}
