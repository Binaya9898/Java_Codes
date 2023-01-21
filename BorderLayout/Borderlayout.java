import java.awt.*;
import javafx.scene.control.Button;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

public class Borderlayout {
    Frame frame;

    Borderlayout() {
        Frame frame = new Frame("Border Layout");
        Button bx1 = new Button("NORTH");
        Label bx11 = new Label("NORTH NEW");
        Button bx2 = new Button("South");
        Button bx3 = new Button("EAST");
        Button bx4 = new Button("West");
        Button bx5 = new Button("CENTER");


        frame.add(bx1);
        // frame.add(bx11,Borderlayout.CENTER);
        frame.add(bx2,BorderLayout.SOUTH);
        frame.add(bx3,BorderLayout.EAST);
        frame.add(bx4,BorderLayout.WEST);
        frame.add(bx5,BorderLayout.CENTER);

        frame.setSize(400,400);
        frame.setVisible(true);

    }

    public void windowClosing(WindowEvent e){
        System.exit(0);
    }

    public static void main(String[] args) {
        new Borderlayout();
    }
}