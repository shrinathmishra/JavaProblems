import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class MinString {


    static void minny(String s){

        Pattern pattern=Pattern.compile("[a-zA-Z]+");
        String[] st= pattern.split(s);
        //boolean matchFound = matcher.find();
        //System.out.println(Arrays.toString(st));
        List<String> ll= new ArrayList<>(Arrays.stream(st).toList());
        ll.removeIf(String::isEmpty);
        int[] arr=new int[ll.size()];
        // System.out.println(ll);
        for(int i=0;i<ll.size();i++){
            arr[i]=Integer.parseInt(ll.get(i));
        }
        Arrays.sort(arr);

        System.out.println(arr[0]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        minny(s);

    }
}