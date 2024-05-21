package shailendrajava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class iu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String str1 = "aac";
	        String str2 = "xxy";

	        List<Character> charMap = new ArrayList<>();
	        Set<Character> mappedChars = new HashSet<>();
	        boolean isIsomorphic = true;

	        for (int i = 0; i < str1.length(); i++) {
	            char char1 = str1.charAt(i);
	            char char2 = str2.charAt(i);

	            if (charMap.size() <= char1) {
	                charMap.add(char1, char2);
	                if (!mappedChars.add(char2)) {
	                    isIsomorphic = false;
	                    break;
	                }
	            } else {
	                if (charMap.get(char1) != char2) {
	                    isIsomorphic = false;
	                    break;
	                }
	            }
	        }

	        if (str1.length() == str2.length() && isIsomorphic)
	            System.out.println("True");
	        else
	            System.out.println("False");
	    }
	    }
	


	


