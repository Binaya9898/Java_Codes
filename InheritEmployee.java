public class InheritEmployee {
    String name="Binaya Koirala";
    String address="Pokhara";

    public static void main(String[] args) {
        Developer dv=new Developer();
        System.out.println(dv.name+ dv.address+ dv.dep);

        
    }
}
 class Developer extends InheritEmployee{
    String dep="Developer";
   
}


