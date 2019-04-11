package me.cscar.gui.listener;

import me.cscar.gui.panel.SpendPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import me.cscar.gui.panel.SpendPanel;

public class SpendPanelListener implements ActionListener {

    //监听器获取Panel组件
    /*private final SpendPanel sp;

    public SpendPanelListener(SpendPanel sp) {
        this.sp = sp;
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        //SpendPanel.instance.vAvgSpendPerDay.setText("xxxxx");
        SpendPanel.instance.vAvgSpendPerDay.setText("￥120");
    }
}
