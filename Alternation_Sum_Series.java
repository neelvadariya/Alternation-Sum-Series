import java.util.Scanner;

public class Alternation_Sum_Series {

    //function defination
    public static int alternateSumFind(int num)
    {
        // 1.Base case condition
        if(num==0)
        {
            return 0;
        }
        // 2. Recursive condition
        if(num%2==0)
        {
            return alternateSumFind(num-1) - num;
        }
        else
        {
            return alternateSumFind(num-1) +num;
        }
    }

    
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to find Alternate Sum: ");
        int num = sc.nextInt();

        //function calling
        int result = alternateSumFind(num);
        System.out.println("The alternate Sum Series is: " + result);
    }
}
