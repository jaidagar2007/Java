import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of student : ");
        float marks = sc.nextFloat();
        if(marks>=80&&marks<=100){
            System.out.println("Distinction");
        }
        else if(marks>=70&&marks<80){
            System.out.println("Merit");
        }
        else if(marks>=50&&marks<70){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }

}
