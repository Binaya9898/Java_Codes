/**
 * GenericFnx
 */
public class GenericFnx {

    public <t>void findSum( t a,t b){
        System.out.println(a);

        // System.out.println(b);
    }

    public static void main(String[] args) {
        GenericFnx gfx=new GenericFnx();
        gfx.findSum(Integer.valueOf(20) ,Integer.valueOf(20));
        gfx.findSum(String.valueOf("Pokhara"), String.valueOf("Pokhara"));


    }



}