
/*given an array of integers, output an array that contains the number 
 * of prime factor for each integer
 * */
public class NumberOfPrimeFactors {

	public static void main(String[] args) {
		int [] arr = {123,666,3333};
		int [] op = find(arr);
		for(int i: op)
			System.out.print(" " + i);
	}

	private static int[] find(int[] arr) {
		int [] op = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			for(int j=2;j<=arr[i];j++){
				if(arr[i]%j==0){
					op[i] += 1;
					arr[i]/=j;
				}
			}
		}
		return op;
	}

}
