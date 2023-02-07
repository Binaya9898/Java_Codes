class GenericClass1<T>{
T name;

//This function takes 
void getName(T name){
    this.name=name;
    //Here this keyword refers to the data member of the class and name refers to 
    // the argument send from the function call.
}
void printName(){
    System.out.println(name);
}
}

public class GenericClass{
    public static void main(String[] args) {
        GenericClass1 <String> g1=new GenericClass1();
        GenericClass1 <Integer> g2=new GenericClass1();
        g1.getName("Binaya");
        g1.printName();
        g2.getName(1011);
        g2.printName();


    }
}

//Summary:
/*So the main objective of generic class is to show it can operate with different types
 of data types. 
 */
