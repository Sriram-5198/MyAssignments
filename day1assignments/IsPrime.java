package week1.day1assignments;

public class IsPrime {

	public static void main(String[] args) {
		int input=10;
		boolean bPrime = true;
		for (int i = 2; i < input; i++) {
			if (input%i==0) {
              System.out.println("Non prime");	
              bPrime=false;
              break;
			}
		}
        if (bPrime) {
             System.out.println("Prime number");			
		}
	}
	
}