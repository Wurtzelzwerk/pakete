import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frontend extends JFrame {
    Color myPrimaryColor = new Color(0,0,255);
    Color mySecondaryColor = new Color(236, 15, 184);

    public ArrayList<Button> buttons = new ArrayList<Button>();

    private Panel buttonPanel;

    Frontend(){
        this.setTitle("Paketstation");
        this.setSize(640,480);
        // Set border layout
        this.setLayout(new BorderLayout());
        // create a new panel with border layout
        Panel panel = new Panel(new BorderLayout());
        TextField topTextField = new TextField("Textfield");

        topTextField.setBackground(this.myPrimaryColor);
        panel.add(new TextField("Textfield"), BorderLayout.CENTER);
        // create abutton grid layout 1x4

        buttonPanel = new Panel(new GridLayout(4,1));
        createButtonPanel("Einfügen");
        createButtonPanel("Entnehmen");
        createButtonPanel("Auflisten");
        createButtonPanel("Ende");

        panel.add(buttonPanel, BorderLayout.EAST);
        panel.add(new Label("Empfänger"), BorderLayout.WEST);
        // add panel to main frame North
        this.add(panel, BorderLayout.NORTH);
        TextField monitor = new TextField("Hier INfos");
        monitor.setEditable(false);
        this.add(monitor,BorderLayout.CENTER);
        Color pink = new Color(236, 15, 184);
        Label textLabel = new Label("Paket entnommen.");
        textLabel.setForeground(pink);
        this.add(textLabel, BorderLayout.SOUTH);
        this.setVisible(true);
    }



   public void createButtonPanel(String text){
        Button button = new Button(text);
        this.buttonPanel.add(button);
        buttons.add(button);
    }










































































































































































































































































































































}
