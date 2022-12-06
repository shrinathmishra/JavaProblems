import java.util.*;

public class RightTrianglePattern
{
    public static void main(String args[])
    {
        int i, j,number, n=9;

        for(i=0; i<n; i+=2)
        {
            number=1;

            for(j=0; j<=i; j++)
            {

                System.out.print(number+ " ");

                number++;
            }

            System.out.println();
        }
    }
}