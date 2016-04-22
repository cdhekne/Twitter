
public class DivisionWithoutDivideOperator {

	public static void main(String[] args) {

		System.out.println(divide(972,5));

	}

	private static int divide(int dividend, int divisor) {

		int current = 1;
		int answer = 0;

		if ( divisor > dividend) 
			return 0;

		if ( divisor == dividend)
			return 1;

		while (divisor <= dividend) {
			divisor <<= 1;
			current <<= 1;
		}

		divisor >>= 1;
		current >>= 1;

		while (current!=0) {
			if ( dividend >= divisor) {
				dividend -= divisor;
				answer |= current;
			}
			divisor >>= 1;
			current >>= 1;
		}    
		return answer;
	}

}
