
public class ReverseOrderOfWordsInSentence {

	public static void main(String[] args) {
		System.out.println(reverseOrder("Chinmay is a grad student."));
	}

	private static String reverseOrder(String string) {
		
		String [] strArray = string.split(" ");
		string="";
		for(int i=strArray.length-1;i>0;i--){
			string+=strArray[i]+" ";
		}
		string+=strArray[0];
		return string;
		
	}

}
