import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] inpArr = {"tea", "ate", "eat", "apple", "java", "vaja", "cut", "utc"};

		List<String> inpList = new ArrayList<String>();
		Set<String> opList = new HashSet<String>();

		for(String s: inpArr)
			inpList.add(s);

		for(int i=0;i<inpList.size()-1;i++){
			for(int j=i+1;j<inpList.size();j++){
				if(isAnagram(inpList.get(i),inpList.get(j))){
					opList.add(inpList.get(i));
					opList.add(inpList.get(j));
					inpList.remove(j--);
				}
			}
		}
		System.out.println(opList);
	}

	private static boolean isAnagram(String str1, String str2) {

		if(str1.length()!=str2.length())
			return false;
		else{
			char[] str1Array = str1.toLowerCase().toCharArray();
			char[] str2Array = str2.toLowerCase().toCharArray();
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			return Arrays.equals(str1Array, str2Array);
		}
		
	}

}
