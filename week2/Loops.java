
public class LoopPatterns 
{
   public static void pattern1(){
   for(int i=0;i<4;i++)
    {
      for(int j=0;j<4;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }  
   }
   public static oid pattern2()
   {
      for(int i=0;i<4;i++)
        {
        for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
         System.out.println();
        }
   }
   public static void pattern3()
   {
      for(int i=0;i<4;i++)
        {
        for(int j=0;j<=i;j++)
            {
                System.out.print(j+1);
            }
        System.out.println();
        }
   }
   public static vvoid pattern4()  
   {
      for(int i=4;i>0;i--)
        {
        for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
   }
   public static void pattern5()
   {
        for(int i=0;i<4;i++)
        {
        for(int j=0;j<=i;j++)
            {
                System.out.print(i+1);
            }
         System.out.println();
        }
   }
}
