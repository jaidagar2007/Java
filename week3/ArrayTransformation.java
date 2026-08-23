public class ArrayTransformation {
    public static void reverseinPlace(int arr[]){
        int right = arr.length-1;
        int left = 0;
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right] = temp;
        }
    }
    public static int[] ReversedCopy(int[] arr){
        int rev[] = new int[arr.length];
        int index =0;
        for(int i = arr.length-1;i>=0;i--){
            rev[index++] = arr[i];
        }
        return rev;
    }
    public static int remove(int arr[],int target){
        int n = arr.length;
        int count =0;
        for(int i =0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return arr.length-count;
    }
    public static void runningSum(int arr[]){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(sum);
        }
    }
    
}
