package me.cscar.gui.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import me.cscar.gui.util.CenterPanel;
import me.cscar.gui.util.GUIUtil;

public class MainPanel extends JPanel {

    public static MainPanel instance = new MainPanel();

    /**
     * 工具栏以及按钮组件对象
     */
    public JToolBar tb = new JToolBar();
    public JButton bSpend = new JButton();
    public JButton bRecord = new JButton();
    public JButton bCategory = new JButton();
    public JButton bReport = new JButton();
    public JButton bConfig = new JButton();
    public JButton bBackup = new JButton();
    public JButton bRecover = new JButton();
    public JButton bRandom = new JButton();

    /**
     * 不同功能的面板
     * TODO...
     */
    public CenterPanel workingPanel;

    private MainPanel() {

        GUIUtil.setImageIcon(bSpend, "home.png", "主页");
        GUIUtil.setImageIcon(bRandom, "category1.png", "随机");
        GUIUtil.setImageIcon(bRecord, "record.png", "记账");
        GUIUtil.setImageIcon(bCategory, "category2.png", "分类");
        GUIUtil.setImageIcon(bReport, "report.png", "报表");
        GUIUtil.setImageIcon(bConfig, "config.png", "设置");
        GUIUtil.setImageIcon(bBackup, "backup.png", "备份");
        GUIUtil.setImageIcon(bRecover, "restore.png", "恢复");

        tb.add(bSpend);
        tb.add(bRandom);
        tb.add(bRandom);
        tb.add(bRecord);
        tb.add(bCategory);
        tb.add(bReport);
        tb.add(bConfig);
        tb.add(bBackup);
        tb.add(bRecover);
        tb.setFloatable(false);

        workingPanel = new CenterPanel(0.8);

        setLayout(new BorderLayout());
        add(tb, BorderLayout.NORTH);
        add(workingPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(MainPanel.instance, 1);
    }
}
