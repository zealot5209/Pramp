package LeetCode;
//reverse char[]
public class Pramp1 {
	public static void main(String[] args) {
		char[] given={' ',' ', 'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',' ', 'm', 'a', 'k', 'e', 's', ' ', 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' };
        System.out.println(new Pramp1().reverseWords(given));
    }
	 
		public char[] reverseWords(char[] arr) {
		    
        int n=arr.length;
        mirrorReverse(arr, 0,n-1);
        int wordStart=0;
        for(int i=0;i<n;i++){
        	if(arr[i]!=' ') 
        		wordStart=i;
        	break;}
        
        
        for(int i=0;i<n;i++){
            if(arr[i]==' '){        
                    mirrorReverse(arr,wordStart,i-1);
                    wordStart=i+1;
        
            }
           else if (i==n-1){
                 mirrorReverse(arr,wordStart,i);
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


