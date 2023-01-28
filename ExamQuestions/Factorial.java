import java.util.*;
public class Factorial{
    int fact(int n){
        if(n==0){
            return 1;
        }
        else
           return n=n*fact(n-1);
        

    }
    public static void main(String[] args) {
        Factorial f1=new Factorial();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(f1.fact(a));

        
    }
}