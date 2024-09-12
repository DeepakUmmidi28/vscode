package Algorithms;
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char arr[]={'c','f','j'};
        char tar='j';
        System.out.println(nextGreatestLetter(arr, tar));
     }

    public static char nextGreatestLetter(char[] letters, char tar) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // if(start==letters.length)
            // return letters[0];

             if(tar<letters[mid])
            end=mid-1;

            else
            start=mid+1;

        }
        return letters[start%letters.length];
    }

//     public char nextGreatestLetter(char[] letters, char target) {

//         int start = 0;
//         int end = letters.length - 1;

//         while(start <= end) {
//             // find the middle element
// //            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//             int mid = start + (end - start) / 2;

//             if (target < letters[mid]) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return letters[start % letters.length];
//     }
}
