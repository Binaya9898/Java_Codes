class Bank{
    String Depositor;
    int AccNum;
    boolean type;
    double balance;

    void assignValue(int AccNum,
    boolean type,
    double balance){
        this.AccNum=AccNum;
        this.type=type;
        // this.type=type;
        this.balance=balance;
    }
    void deposit(String Depositor,double balance){
        System.out.println(balance);
        this.Depositor=Depositor;
        if(balance>5000){
            this.balance=this.balance+balance;
        }
        else{
            System.out.println("Cannot deposit less than 5k");
        }
    }
   void show(){
        System.out.println(Depositor);
        System.out.println(balance);
    }

}
public class Qn2015F extends Bank{
   

    public static void main(String[] args) {
        Qn2015F obj=new Qn2015F();
        obj.assignValue(010115, false, 5000);
        obj.deposit("Binaya",50000);
        obj.show();
    }
}
