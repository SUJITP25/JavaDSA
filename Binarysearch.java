public class Binarysearch {
    public static void binarySeach(int[] arr, int target) {
        // leetcode 704
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                System.out.println("element found at index" + mid);
                return;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("elemenyt not found");
    }

    // Leetcode First Occurance
    public static void findTheFirstOccurance(int arr[], int ele) {
        int left = 0;
        int idx = -1;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (ele < arr[mid]) {
                right = mid - 1;
            } else if (ele > arr[mid]) {
                left = mid + 1;
            } else {
                idx = mid;
                right = mid - 1;
            }
        }
    }

    // Leetcode LastOccurance
    public static void findTheLastOccurance(int arr[], int ele) {
        int left = 0;
        int idx = -1;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (ele < arr[mid]) {
                right = mid - 1;
            } else if (ele > arr[mid]) {
                left = mid + 1;
            } else {
                idx = mid;
                left = mid + 1;
            }
        }
    }

    // Leetcode 852 - Peak Index in Mountain Array
    public static void searchInMountainArray(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
              System.out.println(arr[mid]); 
              return;
            } 
            if ((arr[mid] > arr[mid - 1]) && (arr[mid] < arr[mid + 1])) {
                left = mid + 1;
                System.out.println(arr[mid]);
                return;
            } else {
                right = mid - 1;
                System.out.println(arr[mid]);
                return;
            }
        }
    }

    // Leetcode 2529 - maximum Count of Positve Integer and Negative Integer. 
    public static void maxOfPositiveNegative(int arr[]){

    }

    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 5;
        binarySeach(arr, target);
        int arr2[] = { 1, 2, 5, 3, 4 };
        searchInMountainArray(arr2);

    }
}

// Where will Binary Search Apply?
// When you find a sorted Array?
// Sorted Search Space
