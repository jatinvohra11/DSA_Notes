# 1. What is an Array?
    An array is a data structure that stores multiple values of the same data type in a continuous memory location.
    Instead of creating many variables, we use one array variable.
    Example:
    int[] arr = {10, 20, 30, 40};
    Here, arr stores 4 integers.

# 2. Why do we use Arrays?
    To store multiple values in one variable
    To access elements using index
    To reduce code length
    Used in almost all DSA problems

# 3. Types of Arrays in Java
    1D Array (One Dimensional)
    2D Array (Two Dimensional – Matrix)
    Multi-Dimensional Array (3D, etc.)
    Mostly in DSA, we use 1D and 2D arrays.

# 4. Declaration and Initialization
4.1 Declaration :-
    int arr[];
4.2 Initialization :-
    arr = new int[5];
4.3 Both
    int arr[] = new int[5];
4.4 Direct Initialization
    int arr[] = {1,2,3,4,5}

# 5. Indexing in Array
    Array index starts from 0
    Last index = size - 1
    eg- int arr[] = {10, 20, 30}
        arr[0] = 10
        arr[1] = 20
        arr[2] = 30

# 6. Accessing and Updating Elements
Access:
    System.out.println(arr[0]);
Update:
    arr[1] = 50;

# 7. Array Length
In Java, array has a length property:
    int n = arr.length;

# Taking input in array and printing array(traversal)
    int[] arr = new int[n];
            //input
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            //printing
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            This process is called Traversal.

# 12. Time Complexity of Array Operations
    Access by index: O(1)
    Traversal: O(n)
    Search (Linear): O(n)
    Insertion/Deletion (worst case): O(n)

# 13. Advantages of Arrays
    Fast access using index
    Simple and easy to use
    Good for fixed-size data
    Memory efficient (continuous memory)

# 14. Disadvantages of Arrays
    Fixed size (cannot grow or shrink)
    Insertion and deletion is costly
    Wastage of memory if size is not used fully
    Only same data type elements

# 15. Important DSA Interview Problems from Arrays
    Reverse an array
    Find max/min
    Second largest / second smallest
    Remove duplicates
    Rotate array
    Check sorted array
    Find missing number
    Linear search / Binary search
    Prefix sum problems