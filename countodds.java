import java.util.*;

public class countodds{

    public static void odd(int a){
        int sum = 0;
        for(int i=1;i<a;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        odd(a);

        sc.close();
    }


}