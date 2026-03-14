import java.util.Scanner;

public class HollowDiamond {

    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

        // Upper part of Diamond
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }

            System.out.print("*");
        
            //print inner spaces
            if(i > 1)
            {
                for(int j = 1; j <= (2*i-3); j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower part  of Diamond
        for(int i = n-1; i >= 1; i--)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(" ");
            }

            System.out.print("*");
            
            //print inner spaces
            if(i > 1)
            {
                for(int j = 1; j <= (2*i-3); j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
