public class Binarysearch {
    public static void binarySeach(int[] arr, int target){
        int left =0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target == arr[mid]){
                System.out.println("element found at index"+mid);
                return;
            }else if(target > arr[mid]){
                left = mid+1 ;
            }else{
                right = mid-1;
            }
        }
        System.out.println("elemenyt not found");
    }
    public static void main(String[] args) {
       int arr[] = {1,2,3,4,5}; 
       int target =5;
       binarySeach(arr, target);
        
    }
}

// Where will Binary Search Apply?
// When you find a sorted Array?
// Sorted Search Space 
