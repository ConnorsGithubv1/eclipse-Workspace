package practice;

public class reverse {
	
	private int number;
	private int lastdigit;
	private int reverse;
	
	public reverse(int num) {
		number = num;
		
	}

	public void findreverse(int number) {
		// TODO Auto-generated method stub
		
		lastdigit = 0;
		
		while(number > 0) {
			lastdigit = number % 10;
			reverse = (reverse * 10) + lastdigit;
			number = number / 10;
		
		}
		
		System.out.println(reverse);

	}
	


}