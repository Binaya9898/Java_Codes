import javax.swing.*;
// import javax.swing.event.*;

public class SwingEx extends JFrame {
    JFrame jf;
SwingEx(){
    setSize(400,400);
    setVisible(true);

    JLabel l=new JLabel("Hello I am Binaya KOirala");
    add(l);
    l.setBounds(100,100,500,90);
    setLayout(null);


    JTextField txt=new JTextField();
    add(txt);
    txt.setBounds(100,200,100,60);

    JButton btn=new JButton("Click me");
    add(btn);
    btn.setBounds(200,400,50,60);


}
public static void main(String[] args) {
    new SwingEx();
}


    
}
