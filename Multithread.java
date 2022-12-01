public class Multithread{
    
        public static void main(String[] args){
            Mthread m1=new Mthread();
            Mthread1 m2=new Mthread1();
            m1.start();
            m2.start();
            
            
    
        }
    }


class Mthread extends Thread{
    public void run(){
        for(int i=0;i<20;i++){

            System.out.println( "Thread " + Thread.currentThread().getName()
            + " is running");
        }
    }

}

class Mthread1 extends Thread{
    public void run(){
        for(int i=0;i<20;i++){

            System.out.println( "Thread " + Thread.currentThread().getName()
            + " is running");
        }
    }

}

