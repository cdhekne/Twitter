import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class AddVeryLargeNumbers {

	public static void main(String[] args) {
		String s1 = "1111";
        String s2 = "91";
        add(s1, s2);
	}

	private static void add(String s1, String s2) {
	
		List<String> finalResult = new ArrayList<String>();
		
		int i=s1.length()-1;
		int j=s2.length()-1;
		Integer carry = 0;
		while(true){
			int num1=0;
			int num2=0;
			if(i>=0)
				num1 = Integer.parseInt(Character.toString(s1.charAt(i)));
			if(j>=0)
			num2 = Integer.parseInt(Character.toString(s2.charAt(j)));
			
			Integer addition = num1 +num2 + carry;
			if(addition>9){
				carry=1;
				addition -=10;
			}
			else
				carry=0;
			finalResult.add(addition.toString());
			i--;
			j--;
			if(i<0){
				if(carry>0)
					finalResult.add(carry.toString());
				break;
			}
		}
		Collections.reverse(finalResult);
		
		for(String s: finalResult)
			System.out.print(""+s);
	}
}
