import javax.swing.*;
import java.awt.*;

public class Frontend extends JFrame {
    Color myPrimaryColor;
    Color mySecondaryColor;
    Frontend(){
        Color blue = new Color(0,0,255);
        this.setTitle("Paketstation");
        this.setSize(640,480);
        // Set border layout
        this.setLayout(new BorderLayout());
        // create a new panel with border layout
        Panel panel = new Panel(new BorderLayout());
        TextField topTextField = new TextField("Textfield");
        topTextField.setBackground(blue);
        panel.add(new TextField("Textfield"), BorderLayout.CENTER);
        // create abutton grid layout 1x4
        Panel buttonPanel = new Panel(new GridLayout(4,1));
        buttonPanel.add(new Button("Einfüen"));
        buttonPanel.add(new Button("Entnehmen"));
        buttonPanel.add(new Button("Auflisten"));
        buttonPanel.add(new Button("Ende"));

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
}
