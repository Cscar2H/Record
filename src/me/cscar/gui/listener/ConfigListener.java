package me.cscar.gui.listener;
 
import me.cscar.gui.panel.ConfigPanel;
import me.cscar.gui.util.GUIUtil;
import me.cscar.service.ConfigService;

import java.awt.event.ActionEvent;
 
import java.awt.event.ActionListener;
import java.io.File;
 
import javax.swing.JOptionPane;
 

public class ConfigListener implements ActionListener{
 
    @Override
    public void actionPerformed(ActionEvent e) {
        ConfigPanel p = ConfigPanel.instance;
        //判断
        if(!GUIUtil.checkNumber(p.tfBudget, "预算")) {
            return;
        }
        String mysqlPath =p.tfMysqlPath.getText();
        //判断MySQL路径是否正确
        if(0!=mysqlPath.length()){
            File commandFile = new File(mysqlPath,"bin/mysql");
            if(!commandFile.exists()){
                JOptionPane.showMessageDialog(p, "Mysql路径不正确");
                p.tfMysqlPath.grabFocus();
                return;
            }
        }
         
        ConfigService cs= new ConfigService();
        cs.update(ConfigService.budget,p.tfBudget.getText());
        cs.update(ConfigService.mysqlPath,mysqlPath);
         
        JOptionPane.showMessageDialog(p, "设置修改成功");
 
    }
 
}