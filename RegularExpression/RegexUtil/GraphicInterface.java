import java.awt.Frame;
import java.awt.Color;

public class GraphicInterface {
    Frame mainFrame = null;


    private void initWindow() {
        mainFrame = new Frame("Test Version");
        mainFrame.setBounds(100,100,200,200);
        mainFrame.setBackground(Color.cyan);
        mainFrame.setVisible(true);
        mainFrame.setResizable(true);
    }

    public static void main(String[] args) {
        GraphicInterface myGUI = new GraphicInterface();
        myGUI.initWindow();
    }
}