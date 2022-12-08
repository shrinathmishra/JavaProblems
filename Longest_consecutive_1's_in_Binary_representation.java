import java.util.Scanner;

public class main {
    public static void main(String strings[]) {
        int num = 57;
        int n = num;
        int count = 0;
        while (num!=0) {
            num = (num & (num << 1));
            count++;
        }
        System.out.println("The length of the longest consecutive 1's in binary representation of " + n + " is: " +count);
    }
}


