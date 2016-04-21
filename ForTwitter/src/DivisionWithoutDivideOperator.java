
public class DivisionWithoutDivideOperator {

	public static void main(String[] args) {

		System.out.println(divide(972,5));

	}

	private static int divide(int dividend, int divisor) {

		int denom = divisor;
		int current = 1;
		int answer = 0;

		if ( denom > dividend) 
			return 0;

		if ( denom == dividend)
			return 1;

		while (denom <= dividend) {
			denom <<= 1;
			current <<= 1;
		}

		denom >>= 1;
		current >>= 1;

		while (current!=0) {
			if ( dividend >= denom) {
				dividend -= denom;
				answer |= current;
			}
			denom >>= 1;
			current >>= 1;
		}    
		return answer;
	}

}
