import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Presenter implements ActionListener, MouseListener {
    private Frontend frontend;
    private PaketStation paketStation;
    Presenter(){
         frontend = new Frontend();

         for(Button button : frontend.buttons){
             button.addActionListener(this);
             button.addMouseListener(this);
         }

         paketStation = new PaketStation();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(e.getActionCommand());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getClickCount() == 2){
            System.out.println("Double clicked");
            this.frontend.myPrimaryColor = Color.RED;
        }


        System.out.println(e.getClickCount());
        System.out.println("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
