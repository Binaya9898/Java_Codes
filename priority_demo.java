public class priority_demo{
    public static void main(String[] args){
       
        prdemo t1=new prdemo();
        
        prdemo t2=new prdemo();
        prdemo t3=new prdemo();
        prdemo t4=new prdemo();
        prdemo t5=new prdemo();

        System.out.println("Binaya");
        t1.setPriority(1);
        t2.setPriority(9);
        t3.setPriority(7);

        t4.start();
        try{
            t4.join();
        }
        catch (Exception e){

        }
        t5.start();
        // t6.start();


    }
}

class prdemo extends Thread{
public  void run(){
    Thread t=currentThread();
    for(int i=0;i<5;i++){
    // System.out.println("I am Binaya");
            System.out.println(t.getId());

    }
    
        // System.out.println(t);

        // System.out.println(t.getName());
        // System.out.println(t.getId());
        //  System.out.println(t.getPriority());



}
}