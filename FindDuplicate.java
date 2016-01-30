package LeetCode;
import java.util.*;



public class FindDuplicate {
	public static void main(String[] args) {
		//int[] arr1={1,2,3,5,6};
		int[] arr1={};
		int[] arr2={1,3,4,6};
		
        System.out.println(new FindDuplicate().function(arr1,arr2));
    }

// arr1 = [1, 3, 5]
//^
//p1
// arr2 = [3, 5, 9, 20]
//^
//p2

// case 1: arr1[p1] == arr2[p2]
//res.add(arr1[p1])
//p1++; p2++;
// case 2: arr1[p1] < arr2[p2]
//p1++;
// case 3: arr1[p1] > arr2[p2]
//p2++;
   
public ArrayList<Integer> function(int[] arr1, int[] arr2){
	ArrayList<Integer> res=new ArrayList<Integer>();
	int p1=0;
	int p2=0;
	int m=arr1.length;
	int n=arr2.length;
	if(m==0||n==0) {
		throw new IllegalArgumentException("length should be positive");
		//return null;
	}

	while(p1<m && p2<n){
		if(arr1[p1]==arr2[p2]){
			res.add(arr1[p1]);
			p1++;
			p2++;}
		else if(arr1[p1]<arr2[p2])
			p1++;
		else p2++;
		}
	return res;
	}
}



//m*log(n)
//arr1 doesn't need to be sorted

//public ArrayList<Integer> function(int[] arr1, int[] arr2){
/*
public int[] function(int[] arr1, int[] arr2){
ArrayList<Integer> res=new ArrayList<Integer>();
int m=arr1.length;
int n=arr2.length;
if(m==0||n==0) return null;
for(int i=0;i<m;i++){
//int k=arr1[i];
//System.out.println(k);
if(binarysearch(arr2,arr1[i])){
res.add(arr1[i]);}
//System.out.println(res);
}

int[] result=new int[res.size()];
//int[] result = res.toArray(new int[res.size()]);
for(int i=0;i<res.size();i++){
	result[i]=res.get(i);
System.out.println(res.get(i));
}

return result;
}



public boolean binarysearch(int[] arr,int num){
int n=arr.length;
int low=0;
int high=n-1;
while(low<=high){
int mid=low+(high-low)/2;
if(arr[mid]==num) return true;
else if(arr[mid]>num) {
high=mid-1;
}
else low=mid+1;}
return false;
}
}
*/