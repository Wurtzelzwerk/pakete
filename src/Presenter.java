import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {
    private Frontend frontend;
    private PaketStation paketStation;
    Presenter(){
         frontend = new Frontend();
         frontend.addActionListener(this);
         paketStation = new PaketStation();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Ende")){
            System.out.println("Ende");
        }
    }
}
