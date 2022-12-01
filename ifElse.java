//WAp to display if a user can vote or not.4

import java.util.*;
class ifElse{
    public static void main(String[] args){
     Scanner ip=new Scanner(System.in);
    System.out.println("Enter a age");
    int age=ip.nextInt();
    // System.out.println(age);
    if (age>18) {
        System.out.println("Can Vote");

    }
    else if (age<0){
        System.out.println("You're Dead");

    }

    else{
        System.out.println("Cannot Vote");

    }

    

    }
    
}