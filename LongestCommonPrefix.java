import java.util.*;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"flower", "flow", "flight"};
		String[] str2 = {"dog", "racecar", "car"};
		
		longestCommonPrefix(str);
		longestCommonPrefix(str2);
		
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		String prefix = "";
		int arrSize = strs.length;
		
		if(arrSize == 0) {
			return "";
		}
		
		if(arrSize == 1) {
			return strs[0];
		}
		
		Arrays.sort(strs);
		
		int minLen = Math.min(strs[0].length(), strs[arrSize-1].length());
		
		int i=0;
		while(i<minLen && strs[0].charAt(i) == strs[arrSize-1].charAt(i)) {
			i++;
		}
		
		prefix = strs[0].substring(0, i);
		
		
		return prefix;
	        
	    }

}
