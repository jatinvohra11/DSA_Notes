import java.util.*;
// Taking input in array

// public class Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.print("Enter array value : ");
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

//Prb 1) Find sum of elements: 
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int sum = 0;
//         for(int i=0; i<n; i++){
//             sum += arr[i];
//         }
//         System.out.print("Sum of element: " + sum);
//     }
// }

// prb 2) Find smallest/largest number in given array
// public class array {

//     public static void main(String args[]){
//         int arr[] = {12,3,4,8,-1};
//         int size = arr.length;
        // int smallest = Integer.MAX_VALUE;
        // for(int i=0; i<size; i++){
        //     if(arr[i] < smallest){
        //         smallest = arr[i];
        //     }
        // } 
        // System.out.println("Smallest number is : " + smallest);
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<size; i++){
//             if(arr[i] > largest){
//                 largest = arr[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }

// prb 3) Rev a array element
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter size of array : ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.print("Enter array element : ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int start = 0;
//         int end = n -1;

//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//         System.out.println("Reserved array : ");
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// prb 4) check if array is sorted
// public class Array {

//     public static void main(String[] args) {
//         int arr[] = {1,3,2,4,5};
//         int size = arr.length;
//         boolean sorted = true;
//         for(int i=0; i<size-1; i++){
//             if(arr[i] > arr[i+1]){
//                 sorted = false;
//                 break;
//             }
//         }
//         System.out.println(sorted);
//     }
// }

// find second largest number in array
// public class Array {

//     public static void main(String[] args) {
//         int arr[] = {10,20,30,40,50};
//         int largest = Integer.MIN_VALUE;
//         int seclargest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] > largest){
//                 seclargest = largest;
//                 largest = arr[i];
//             }
//             else if(arr[i] > seclargest && arr[i] != largest){
//                 seclargest = arr[i];
//             }
//         }
//         System.out.print(seclargest);
//     }
// }