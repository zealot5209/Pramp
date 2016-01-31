package LeetCode;
//reverse char
public class Solution {
	public static void main(String[] args) {
		char[] given={' ',' ', 'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' };
        System.out.println(new Solution().reverseWords(given));
    }
	 
		public char[] reverseWords(char[] arr) {
		    
        int n=arr.length;
        mirrorReverse(arr, 0,n-1);
        
        int wordStart=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==' '){
                if(wordStart!=-1){
                    mirrorReverse(arr,wordStart,i-1);
                    wordStart=-1;
                }
            }
           else if (i==n-1){
                 if(wordStart!=-1)
                 mirrorReverse(arr,wordStart,i);
           }
           else {
               if(wordStart==-1)
               wordStart=i;
           }
            
        }
        return arr;
        
    }
        
        public void mirrorReverse(char[] arr, int start, int end){
            while(start<end){
                char tmp=arr[start];
                arr[start]=arr[end];
                arr[end]=tmp;
                start++;
                end--;
            }
        }
}


