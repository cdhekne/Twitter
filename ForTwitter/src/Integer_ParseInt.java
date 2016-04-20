
public class Integer_ParseInt {

	public static void main(String[] args) {
		String str = "-1235";
		System.out.println(convert(str));
	}

	private static int convert(String str) {
		
		boolean negative = false;
		if(str.charAt(0)=='-')
			negative=true;
		
		int finalNum = 0;
		int i=0;
		if(negative)
			i=1;
		while(i<str.length()){
			finalNum*=10;
			finalNum+=(str.charAt(i++)-'0');
		}
		if(negative)
			finalNum*=-1;
		return finalNum;
	}

}
