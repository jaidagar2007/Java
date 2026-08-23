public class LinearSearchToolKit {
    public static boolean Containes(int arr[], int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static int FirstIndexOf(int[] arr, int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int LastIndexOf(int arr[] , int target){
        for(int i = arr.length-1;i>=0;i--){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int CountOccurances(int arr[], int target){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    
    
}
