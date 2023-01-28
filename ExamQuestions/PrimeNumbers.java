import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num  from where to find ?");
        int m=sc.nextInt();
        System.out.println("Enter a num  up to where to find ?");
        int n=sc.nextInt();
        // int count=0; 
        int i;
        for( i=m;i<n;i++){
            int count=0;

            for(int j=1;j<i;j++){
                if(i%j==0){
                    count++;
                }
                
            }
            if(count==1){
                System.out.println(i);
            }


           }

        }


    }

