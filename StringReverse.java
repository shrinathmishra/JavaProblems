import java.util.*;
class StringReverse
{
	void reverse(String str)
	{
		if ((str==null)||(str.length() <= 1))
		System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	
	/* Driver program to test above function */
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		//String str = "Hello";
		StringReverse obj = new StringReverse();
		obj.reverse(str);
	}
}
