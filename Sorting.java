public class Sorting {

    // Question: Check if Array is Soted or npt
    public static boolean checkIfArrayIsSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static void bubbleSort(int[] arr) {
        // check if the array is sorted
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted == true)
                break;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    // Question: move All Zeros to the End (Solve Time Complexity in o(n))
    // public static void movesAllZerosToEnd(int[] arr){
    //     int left = 0; 
    //     int right = arr.length-1;
    //     while (left <= right){
    //         if((arr[left] != 0)&&(arr[right]==0)){
    //             int temp = arr[right]; 
    //             arr [right] = arr[left]; 
    //             arr[left] = temp; 
    //             left ++; 
    //             right --; 
    //         }else if(arr[left] !=0){
    //             left ++;
    //         }else if (arr[right]==0){
    //             right--;
    //         }else{
    //             left ++;
    //         }
    //     }
    //     for (int k = 0; k < arr.length; k++) {
    //         System.out.print(arr[k] + " ");
    //     }
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6, 2, 3 };
        int arr2[] = {1,3,0,2,0,4,5};
        System.out.println(checkIfArrayIsSorted(arr));
        checkIfArrayIsSorted(arr);
        bubbleSort(arr);
        // movesAllZerosToEnd(arr2);
    }
}

// Bubble-Sort Algorithms.
// Algporithm from which we can sort an array.
// check Adjacent Elements- swap Adjancent Elements.
// Bubble Sort - time Complexity = o(n**2)
// no.of operations = (n-1)**2 (both loop are working (n-1) times)
// for (int j = 0; j < arr.length-1-i; j++) because with every pass the last
// element get settled at the end.
// Time complexity will not change the speed will increase.


// Selection-Sort Algorithm 
// 





