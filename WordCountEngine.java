package LeetCode;

	//Title of this code
	//'main' method must be in a class 'Rextester'.
	//Compiler version 1.8.0_45
	/*
	import java.util.*;
	import java.lang.*;

	class Rextester
	{   
	   public static void main(String[] args) {
	      char[] arr = {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};
	      reverseOrderOfWords(arr);
	      System.out.println(Arrays.toString(arr));
	   }

	public static void reversePartOfArray(char[] arr, int startingIndex, int endingIndex){
	   // starting index and ending index are exclusive
	   // endingindex < arr.length
	   //[a,b,c]
	   //(0,2)
	   //[b,a,c]
	//   for(int i = startingIndex; i < endingIndex/2; i++){
//	      char temp = arr[i];
//	      arr[i] = arr[endingIndex-i];
//	      arr[endingIndex-i] = temp;
	//   }
	   while(startingIndex < endingIndex){
	      char temp = arr[startingIndex];
	      arr[startingIndex] = arr[endingIndex];
	      arr[endingIndex] = temp;
	      startingIndex++;
	      endingIndex--;
	   }
	}
	// http://rextester.com/runcode
	public static void reverseOrderOfWords(char[] arr){
	   reversePartOfArray(arr, 0, arr.length-1); // if using while loop
	   System.out.println(Arrays.toString(arr));
	   // reversePartOfArray(arr, 0, arr.length);  if using for loop
	   int startingIndex = 0;
	   int endingIndex = 0;
	   for(int i = 0; i < arr.length; i++){
	      endingIndex = i;
	      if(arr[i] == ' '){
	         reversePartOfArray(arr, startingIndex, endingIndex-1);
	         startingIndex = i+1;
	      }
	   }
	   reversePartOfArray(arr, startingIndex, arr.length-1);
	}
	}
	*/



import java.util.*;
//import java.lang.*;

//Character.isLetterOrDigit('s');
public class WordCountEngine {
	public static void main(String[] args) {
		String given="Practice makes perfect. get peRfect by practice. just practice!";
		
        System.out.println(new WordCountEngine().f(given));
    }
	public ArrayList<String> f(String s){
	   ArrayList<String> list=new ArrayList<String>();
	   s=s.replaceAll("[^a-zA-Z ]", "").toLowerCase(); 
	   //Z后面是个space 否则连space也没了
	   //s = s.replaceAll("\\W", "");
	   //String[] arr = inString.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
	   String[] arr=s.split(" ");
	   HashMap<String,Integer> map=new HashMap<String,Integer>();
	   int n=arr.length;
	   // http://www.zytrax.com/tech/web/regex.htm
	   for(int i=0;i<n;i++){
	       String str=arr[i];
	      if(map.containsKey(str)){
	         map.put(str,map.get(str)+1);
	      }
	      else{ 
	         map.put(str,1);
	      }
	   }
	      
	    while(!map.isEmpty()){
	      String key=new String();
	      int max=Integer.MIN_VALUE;
	    for(String k: map.keySet()){
	       int val=map.get(k);
	       if(val>max){
	          max=val;
	          key=k;
	       }
	    }
	    
	   list.add(key+":"+map.get(key));
	   map.remove(key);    
	    }
	     
	    return list;
	   }
	}

	   
	   
	   
	   
	   

