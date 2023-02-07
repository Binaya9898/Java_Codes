 class Generic{

     <t> void getArr(t[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
public class GenericFnx {
    public static void main(String[] args) {
        
        Generic g1=new Generic();
        Integer[] a=new Integer[]{12,12,34,35,23,54};
        String[] b={"bin","binaye","binaya"};
        g1.getArr(a);
        g1.getArr(b);
    }
    

}

/*In this program getArr is a generic fnx that can take different data types array
 and perform the operation.
  We have made two objs and passed two types of data as an argument.
 */