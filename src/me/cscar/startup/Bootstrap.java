package me.cscar.startup;
 
import me.cscar.gui.panel.MainFrame;
import me.cscar.gui.panel.MainPanel;
import me.cscar.gui.panel.SpendPanel;

import javax.swing.SwingUtilities;

 
public class Bootstrap {
    public static void main(String[] args) throws Exception{
 
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                MainFrame.instance.setVisible(true);
                MainPanel.instance.workingPanel.show(SpendPanel.instance);
            }
        });
    }
}