import java.util.*;  

public class SumOfOddAndEvenDigitsInNumber
{
    public static void main(String args[])
    {
        //int number = 312;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number- ");
        int number= sc.nextInt();  
        int EvenNumbers = 0;
        int OddNumbers = 0;
        while (number > 0)
        {
            if ((number % 10) % 2 == 0)
                EvenNumbers = EvenNumbers + number % 10;
            else
                OddNumbers = OddNumbers + number % 10;
            number = number / 10;
        }
        System.out.print("Even Numbers : " + EvenNumbers + " Odd Numbers : " + OddNumbers);
        if (EvenNumbers == OddNumbers)
                System.out.print("Yes");
        else
                System.out.print("No");
    }
    
}