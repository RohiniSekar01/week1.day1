package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8, firstNum=0, secNum=1, sum;
		
		System.out.println(firstNum);
		for (int i = 1; i < range; i++) {
			
			// sum=1
			sum = firstNum + secNum;
			
			//firstNum=1
			firstNum = secNum;
			
			//secNum=1
			secNum = sum;
			
			//sum=1
			System.out.println(sum);
		}

	}

}
