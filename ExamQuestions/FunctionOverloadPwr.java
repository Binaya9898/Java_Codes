import java.util.*;

public class FunctionOverloadPwr {
    public void retIntpwr(int x,int y){
        double a=Math.pow(x, y);
        System.out.println(a);
    }

    public void retIntpwr(double x,double y){
        double a=Math.pow(x,y);
        System.out.println(a);

    }
    public static void main(String[] args) {
        FunctionOverloadPwr flp=new FunctionOverloadPwr();
        flp.retIntpwr(2,3);
        flp.retIntpwr(2.5454,3.28545);
    

    }
}
