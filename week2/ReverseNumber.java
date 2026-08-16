public class ReverseNumber {
    public static void Reverse(int num){
        if(num<10){
            System.out.println("Reversed number is "+num);
        }
        int rev = 0;
        while (num>0) {
            rev = rev*10+num%10;
            num = num%10;
        }
    }
}
