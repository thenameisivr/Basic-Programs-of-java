import java.util.*;
public class fibonacci{

    public static void fib(int n){
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++){
            int c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);

    }
}