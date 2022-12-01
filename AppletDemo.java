import java.applet.*;
import java.awt.*;
/* <applet code =AppletDemo width =1200 height=1200></applet>"*/

public class AppletDemo extends Applet{
    public void init(){
        
        setLayout(null);
        
        Label l1=new Label("Enter Name");
        add(l1);
        l1.setBounds(100,150,100,40);
        TextField t1= new TextField();
        add(t1);
        t1.setBounds(250,150,200,40);


        Label l2=new Label("Enter Address");
        add(l2);
        l2.setBounds(100,200,100,40);
        TextField t2= new TextField();
        add(t2);
        t2.setBounds(250,200,200,40);


        Label l3=new Label("Gender");
        add(l3);
        l3.setBounds(100,250,100,40);

        CheckboxGroup gen=new CheckboxGroup();
        Checkbox male=new Checkbox("Male",gen,true);
        add(male);
        male.setBounds(250,250,100,40);
        

        Checkbox Female=new Checkbox("Female",gen,false);
        add(Female);
        Female.setBounds(400,250,100,40);

        Checkbox others=new Checkbox("Others",gen,false);
        add(others);
        others.setBounds(600,250,100,40);

        Label l4=new Label("City");
        add(l4);
        l4.setBounds(100,300,100,40);

        Choice c1=new Choice();
        c1.addItem("Biratnagar");
        c1.addItem("Kathmandu");
        c1.addItem("Bhaktapur");
        c1.addItem("Pokhara");
        c1.setBounds(250,300,150,40);
        add(c1);

        Label l5=new Label("Faculty");
        add(l5);
        l5.setBounds(100,350,100,40);


        Checkbox c2=new Checkbox("Science");
        add(c2);
        c2.setBounds(220,350,100,40);

        Checkbox c3=new Checkbox("Management");
        add(c3);
        c3.setBounds(400,350,100,40);




        Button b1=new Button("Submit");
        add(b1);
        b1.setBounds(400,400,50,50);

        Button b2=new Button("Cancel");
        add(b2);
        b2.setBounds(600,400,50,50);
    }
    public void paint(Graphics g){
        // g.drawString("Hello",30,30);

    }

}