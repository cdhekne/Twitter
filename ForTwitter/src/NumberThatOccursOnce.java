import java.util.HashMap;
import java.util.Map;



/*
 * Given an array where all numbers except one are repeated, find the 
 * number that only occurs once.
 * */
public class NumberThatOccursOnce {

	public static void main(String[] args) {
		int [] arr = {11,21,12,15,18,21,12,16,16,18,11};
		System.out.println(find(arr));
	}

	private static int find(int[] arr) {
		Map<Integer,Integer> m = new HashMap<Integer, Integer>();
		
		for(int num:arr){
			if(m.containsKey(num))
				m.put(num, m.get(num)+1);
			else{
				m.put(num, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: m.entrySet()){
			if( entry.getValue()==1)
				return entry.getKey();
		}
			
		return 0;
	}

}
