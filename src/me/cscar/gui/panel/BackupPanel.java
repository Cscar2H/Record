package me.cscar.gui.panel;
 
import me.cscar.gui.util.ColorUtil;
import me.cscar.gui.util.GUIUtil;

import javax.swing.JButton;
import javax.swing.JPanel;

 
public class BackupPanel extends JPanel {
             
    public static BackupPanel instance = new BackupPanel();
    JButton bBackup =new JButton("备份");
 
    public BackupPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bBackup);
        this.add(bBackup);
    }
 
    public static void main(String[] args) {
        GUIUtil.showPanel(BackupPanel.instance);
    }
 
}