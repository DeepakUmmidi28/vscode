package Arrays;
import java.util.Arrays;

public class Operations {
    public static int sumOfElements(int arr[]){
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        return sum;
    }

    public static int LinearSearch(int arr[],int target){
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==target)
            return i;
        }
        return -1;
    }

    public static int BinarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        Arrays.sort(arr);
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)return mid;
            if(arr[mid]<target)start=mid+1;
            else if(arr[mid]>target)end=mid-1;
        }
        return -1;
    }

    public static int FindLargest(int arr[]){
        int largest=arr[0];
        for(int x:arr){
            if(x>largest)largest=x;
        }
        return largest;
    }

    public static int FindSecondLargest(int arr[]){
        int largest=arr[0];
        int second=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
        }
        return second;
    }

    public static int[] Rotate(int arr[]){
        int i=0;
        int j=arr.length-1;
        int mid=j/2;
        while(i<=mid && j>=mid){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        return arr;
    } 

    public static int[] Insert(int[] arr,int index,int element){
        int[] NewArray=new int[arr.length+1];
        int last=NewArray.length-1;
        for(int i=last;i>index;i--){
            NewArray[i]=arr[i-1];
        }
        NewArray[index]=element;
        for(int j=index-1;j>=0;j--){
            NewArray[j]=arr[j];
        }
        return NewArray;
    }

    public static int[] Delete(int[] arr,int index){
        for(int i=index;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        return arr;
    }
}

