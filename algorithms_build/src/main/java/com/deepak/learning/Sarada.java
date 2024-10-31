package com.deepak.learning;

public class Sarada
{
	public static void main(String[] args) {
		int arr[]={5,3,4,1,2};
		Cyclic(arr);
		for(int x: arr)
		{
		    System.out.print(x+" ");
		}
	}
	
	// public static void selection(int arr[]){
	//     for(int i=0;i<arr.length;i++){
	//         int last=arr.length-i-1;
	//         int max=getMaxIndex(arr,0,last);
	//         swap(arr,max,last);
	//     }
	// }
	
	// public static int getMaxIndex(int arr[], int start, int end){
	//     int max=0;
	//     for(int i=start;i<=end;i++){
	//         if(arr[i]>arr[max]) max=i;
	//     }
	//     return max;
	// }

	// public static void Insertion(int arr[]){
	// 	for(int i=0;i<=arr.length-2;i++){
	// 		for(int j=i+1;j>0;j--){
	// 			if(arr[j]<arr[j-1])swap(arr,j-1,j);
	// 			else break;
	// 		}
	// 	}
	// }

	public static void Cyclic(int arr[]){
		for(int i=0;i<arr.length;){
			if(arr[i]!=i+1){
				swap(arr, i, arr[i]-1);
			}
			else i++;
		}
	}
	
	public static void swap(int arr[],int first,int second){
	    int temp=arr[first];
	    arr[first]=arr[second];
	    arr[second]=temp;
	}
}