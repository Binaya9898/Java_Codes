import java.util.*;
public class switchCase {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter your operands");
        int op1=ip.nextInt();
        int op2=ip.nextInt();
        System.out.println("Choose Operations:");
        System.out.println("1.Add");
        System.out.println("2.Multiply");
        System.out.println("3.Average");
        int choice=ip.nextInt();
        switch(choice){
            case 1:
            int sum=op1+op2;
            System.out.println("The sum is "+ sum);
            break;
        

        case 2:
        int mul=op1*op2;
        System.out.println("The multiplication is "+ mul);
        break;

        case 3:
        int avg=(op1+op2)/2;
        System.out.println("The average is "+ avg);
        break;
        

        }

}
}
