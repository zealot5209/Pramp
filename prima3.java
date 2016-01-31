package LeetCode;

public class prima3 {
	public static void main(String[] args) {
			char[] given={' ',' ', 'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' };
	        System.out.println(new prima3().reverseWord(given));
	    }


	 public static char[] reverseWord(char[] str){
	      //create new array copy
	      char[] buffer = new char[str.length];
	      
	      //iterate through original array (keep index for beginning and end of word)
	      int begin = 0;
	      int end;
	      for(int i=0; i<str.length; i++){
	         char c = str[i];
	         if(c == ' ' || i == str.length-1){
	            //get end boundary of previous word
	            end = i;

	            // copy word to end of buffer
	            for(int j=end; j>=begin; j--){
	               buffer[buffer.length-1-j] = str[begin];
	            }
	            //insert space to end of buffer
	            if(c == ' ') buffer[buffer.length-2-end] = ' ';

	            //reset
	            begin = i+1;
	         }
	      }
	      
	     return buffer;
	         //when we hit a space, copy the word to the 'end' of new array 
	      
	   }
	}
