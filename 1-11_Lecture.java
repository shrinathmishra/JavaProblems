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
        //System.out.print("Even Numbers : " + EvenNumbers + " Odd Numbers : " + OddNumbers);
        if (EvenNumbers == OddNumbers)
                System.out.print("Yes");
        else
                System.out.print("No");
    }
    
}



import java.util.*;
public class main
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        int n= sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<i){
                    System.out.print(n-i+j);
                }

                else{
                    System.out.print(n);
                }

                System.out.print(" ");
            }
            System.out.println();
       }

    }
}



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