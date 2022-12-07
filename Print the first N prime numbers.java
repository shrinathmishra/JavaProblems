import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
//constructor of the Scanner class

        System.out.print("Enter the value of n to compute the nth prime number: ");
        Scanner sc = new Scanner(System.in);

//reading an integer from the user
        int n = sc.nextInt();
        int num=1, count=0, i;
        while (count < n)
        {
            num=num+1;
            for (i = 2; i <= num; i++)
            {
                //determines the modulo and compare it with 0
                if (num % i == 0)
                {
                    //breaks the loop if the above condition returns true
                    break;
                }
            }
            if (i == num)
            {
                System.out.println("The " +count +"th prime number is: "+num);
//increments the count variable by 1 if the number is prime
                count = count+1;
            }
        }
//prints the first n prime number

    }
}