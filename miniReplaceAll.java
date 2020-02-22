/*
Name: Ifaz Alam
Date: February 22, 2020
Description: A method that attempts to replicate the behaviour of the replaceAll() method
It only works for small strings
*/

public class miniReplaceAll {
	public static String replace(String str, String target, String replacement) {
    // The result of the replacement
    // Initially it is blank
	  String result = "";

    // Iterates over characters of string and determines if they need to be replaced
	  for (int i = 0; i < str.length(); ++i) {
	    if (str.substring(i,i+1).equals(target.substring(0,1))) {
        // Checks if target to be replaced is present at a specific segment of the string
	      if (str.substring(i, i + target.length()).equals(target)) {
          // Replacement
	        result += replacement;

          // Variable i is assigned the index that is after the target
          // Because of the ++i increment, i+= target.length() will jump 2 characters ahead of the target, hence -1
	        i += target.length() - 1;
	      }

        // Concatenates substrings that do not match the target to variable result
	      else {
	        str += str.substring(i, i + 1);
	      }
	    }

      // Concatenates substrings that do not match the target to variable 'result'
	    else {
	      str += str.substring(i, i + 1);
	    }
	  }
    // Returns the string with its replacements
	  return result;
	}
	  
	//test case below (dont change):
	public static void main(String[] args) {
		System.out.println(replace("abcabcabc","abc","<REPLACED>")); //<REPLACED><REPLACED><REPLACED>
  }
}

