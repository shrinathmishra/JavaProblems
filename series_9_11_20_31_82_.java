import java.util.Scanner;

class main {
    public static void main(String[] args) {
        int n = 9;
        int j = 11;
        
        Scanner sc=new Scanner(System.in);  
        int l = sc.nextInt();
        int k;
        
        System.out.print(n + " " + j + " ");
        
        for(int i = 2; i<l; i++) {
            k = n+j;
            System.out.print(k + " ");
            n = j;
            j = k;
        }
    }
}