// Searching two type 
// 1 Linear Search :
import java.util.*;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        System.out.print("Enter array element");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search : ");
        int key = sc.nextInt();

        int index = -1;
        for(int i=0; i<n; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.print("ELement found at index " + index);
        }
        else{
            System.out.print("Element not found the given array");
        }
    }
}
