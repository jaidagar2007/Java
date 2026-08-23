public class ArrayStatistics {
    public static int sum(int arr[]){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static double average(int[] arr){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum/arr.length;
    }
    public static int minimum(int[] arr){
        int minimum = arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static int Maximum(int arr[]){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int countEven(int[] arr){
        int n = arr.length;
        int count =0;
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void printSign(int arr[]){
        int positive =0;
        int negative =0;
        int zero =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]>0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("Positive Number "+positive);
        System.out.println("Negative Number "+negative);
        System.out.println("Zero "+zero);
    }
}
