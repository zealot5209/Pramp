package LeetCode;

import java.util.Arrays;

public class RealPlusOne {
	 public static void main(String[] args){
		 int[] arr ={1,2,3,4,9};
		 int[] res = plusOne(arr);
		 System.out.println(Arrays.toString(res));
	}
	
	 public static int[] plusOne(int[] digits) {
	    if (digits == null || digits.length == 0){
	        return new int[0];  //throw exception?
	    }
	    int n = digits.length;
	    for (int i = n - 1; i >= 0; i--){
	        if (digits[i] >= 0 && digits[i] <= 8){
	            digits[i] += 1;
	            break;
	        }
	        else if (digits[i] == 9){
	            digits[i] = 0;
	        }
	        else 
	          throw new IndexOutOfBoundsException();
	    }
	        if (digits[0] == 0){
	            int[] res = new int[n + 1];
	            res[0] = 1;
	            // for (int i = 1; i < n + 1; i++){
	            //     res[i] = 0;
	            // } ²»ÐèÒª
	            return res;
	        }
	        return digits;
	    }
	}

