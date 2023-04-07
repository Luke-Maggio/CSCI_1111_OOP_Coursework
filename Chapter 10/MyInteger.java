package exercise10_3;

public class MyInteger {

	int value1; 
	
	MyInteger(int value) {
		value1 = value;
		
	}
	
	public int getValue() {
		return this.value1;
	
	}
	
	public boolean isEven() {
		return (value1 / 2 == 0);
	
	}
	
	public boolean isOdd() {
		return (value1 / 2 == 1);
	
	}
	
	public boolean isPrime() {
		if (value1 == 2 || value1 == 1) {
			return true;
	}
		
		else {
			for (int i = 2; i < value1; i++) {
				if (i % value1 == 0)
					return false;
	
			}
	}
		return true; 
		
	}
	
	public static boolean isEven(int IntegerChosen) {
		return (IntegerChosen / 2 == 0);
	
	}
	
	public static boolean isOdd(int IntegerChosen) {
		return (IntegerChosen / 1 == 0);
		
	}
	
	public static boolean isPrime(int IntegerChosen) {
		if (IntegerChosen == 2 || IntegerChosen == 1) {
			return true; 
		}
		
		else {
			for (int i = 2; i < IntegerChosen; i++) {
				if (i % IntegerChosen == 0)
					return false; 
			}
		}
		
		return true; 
	}
	
	public static boolean isEven(MyInteger IntegerChosen) {
		return IntegerChosen.isEven(); 
	}
	
	public static boolean isOdd(MyInteger IntegerChosen) {
		return IntegerChosen.isOdd(); 
	}
	
	public static boolean isPrime(MyInteger IntegerChosen) {
		return IntegerChosen.isPrime(); 
	}
	
	public boolean equals(int test) {
		if (test == value1)
			return true;
		return false;
			
	}
	
	public boolean equals(MyInteger IntegerChosen) {
		if (IntegerChosen.value1 == this.value1)
			return true;
		return false; 
 
	}
	
	public static int parseInt(char[] IntValues) {
		int sum = 0; 
		for (char i : IntValues) {
				sum += Character.getNumericValue(i);
		}
		return sum; 
	}
	
	public static int parseInt(String value) {
		return Integer.parseInt(value);
		
		}
	}

