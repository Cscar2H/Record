package me.cscar.gui.panel;
 
import javax.swing.JFrame;
 
import me.cscar.gui.panel.MainPanel;
import me.cscar.gui.util.GUIUtil;
 
public class MainFrame extends JFrame{
    public static MainFrame instance = new MainFrame();
     
    private MainFrame(){
        this.setSize(500,450);
        this.setTitle("Pocketbook");
        this.setContentPane(MainPanel.instance);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
     
    public static void main(String[] args) {
        instance.setVisible(true);
    }
     
}