import java.awt.*;
import java.awt.event.*;

import javafx.scene.control.TextField;

// import javafx.scene.control.Label;
public class KeylistenerEx extends Frame implements KeyListener,MouseListener {
    // public class KeylistenerEx extends KeyAdapter,MouseAdapter {

    Frame f;
    Label l;
    TextArea t;
     
    Button b;
    KeylistenerEx(){
        addMouseListener(this);
        Label l=new Label("Add text and click change , I will be changed");
        TextArea t=new TextArea();
        Button b=new Button();
        // l.add();
        t.addKeyListener(this);
        // b.addKeyListener(this);
        add(l);
        add(t);
        add(b);
        setLayout(null);
        l.setBounds(400,100,500,80);
        t.setBounds(400,200,300,80);
        b.setBounds(200,400, 100, 50);
        b.addMouseListener(this);


        setVisible(true);
        setSize(400,400);

        addWindowListener (new WindowAdapter(){

            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });

        
    }
   
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        l.setText("I am binaya");

        
    }
   
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        l.setText("I am binaya");

    }
    
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        l.setText("I am binaya");

    }

    
    public void mousePressed(MouseEvent e) {
        
        l.setText("Key pressed");
    }

    
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("I am Changed");

    }

    
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("I am binaya");

    }

           

public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub
    l.setText("I am binaya");

}


public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub
    l.setText("I am binaya");

}





     


 

    public static void main(String[] args) {
        try{

            new KeylistenerEx();
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}
   

