package exercise10_3;

public class Exercise10_3 {

	public static void main(String[] args) {
		
		
	MyInteger integer1 = new MyInteger(39);
	MyInteger integer2 = new MyInteger(43);
	MyInteger integer3 = new MyInteger(90);
		
	System.out.printf("integer 1 is prime? ", integer1.getValue(), integer1.isPrime());
	System.out.printf("integer 2 is prime? ", integer2.getValue(), integer2.isPrime());
	System.out.printf("integer 3 is prime? ", integer3.getValue(), integer3.isPrime());
	
	System.out.printf("integer 1 is even? ", integer1.getValue(), integer1.isEven());
	System.out.printf("integer 2 is even? ", integer2.getValue(), integer2.isEven());
	System.out.printf("integer 3 is even? ", integer3.getValue(), integer3.isEven());
	
	System.out.printf("integer 1 is odd? ", MyInteger.isOdd(39));
	System.out.printf("integer 2 is odd? ", MyInteger.isOdd(43));
	System.out.printf("integer 3 is odd? ", MyInteger.isOdd(90));
	
	System.out.printf(" %d equals %d", integer1.getValue(), integer3.getValue(), integer1.equals(integer3));
	System.out.printf("%d ", MyInteger.parseInt(new char[] { '3', '9', '4'}));
	System.out.printf("%d ", MyInteger.parseInt("9850"));
	}

}
