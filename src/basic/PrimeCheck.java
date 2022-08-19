package basic;

public class PrimeCheck {

	public static boolean isPrime(int number) {
		
//		if(number == 2 || number == 3 || number == 5) {
//			return true;
//		}
		
		int sqrtNumber =  (int) (Math.sqrt(number) + 1);
		
		for(int i = 2; i < sqrtNumber ; ++i) {
			if(number % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("2 is prime: "+PrimeCheck.isPrime(2));
		System.out.println("3 is prime: "+PrimeCheck.isPrime(3));
		System.out.println("4 is prime: "+PrimeCheck.isPrime(4));
		System.out.println("5 is prime: "+PrimeCheck.isPrime(5));
		System.out.println("6 is prime: "+PrimeCheck.isPrime(6));
		System.out.println("7 is prime: "+PrimeCheck.isPrime(7));
		System.out.println("8 is prime: "+PrimeCheck.isPrime(8));
		System.out.println("9 is prime: "+PrimeCheck.isPrime(9));
		System.out.println("10 is prime: "+PrimeCheck.isPrime(10));
		System.out.println("11 is prime: "+PrimeCheck.isPrime(11));
		System.out.println("12 is prime: "+PrimeCheck.isPrime(12));
		System.out.println("13 is prime: "+PrimeCheck.isPrime(13));
		System.out.println("14 is prime: "+PrimeCheck.isPrime(14));
		System.out.println("15is prime: "+PrimeCheck.isPrime(15));
	}
}
