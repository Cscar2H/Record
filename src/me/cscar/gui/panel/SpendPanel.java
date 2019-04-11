package me.cscar.gui.panel;

import javax.swing.*;

import me.cscar.gui.util.CircleProgressBar;
import me.cscar.gui.util.ColorUtil;
import me.cscar.gui.util.GUIUtil;

import java.awt.*;

public class SpendPanel extends JPanel {

    /**
     * 单例化,方便SpendPanelListener监听器获取组件
     */
    public static SpendPanel instance = new SpendPanel();

    /**
     * 组件
     */
    public JLabel lMonthSpend = new JLabel("本月消费");
    public JLabel lTodaySpend = new JLabel("今日消费");
    public JLabel lAvgSpendPerDay = new JLabel("日均消费");
    public JLabel lMonthLeft = new JLabel("本月剩余");
    public JLabel lDayAvgAvailable = new JLabel("日均可用");
    public JLabel lMonthLeftDay = new JLabel("距离月末");

    public JLabel vMonthSpend = new JLabel("￥2300");
    public JLabel vTodaySpend = new JLabel("￥25");
    public JLabel vAvgSpendPerDay = new JLabel("￥120");
    public JLabel vMonthAvailable = new JLabel("￥2084");
    public JLabel vDayAvgAvailable = new JLabel("￥389");
    public JLabel vMonthLeftDay = new JLabel("15天");

    CircleProgressBar bar;

    private SpendPanel() {
        //设置布局器为BorderLayerout
        this.setLayout(new BorderLayout());
        //设置环形进度条
        bar = new CircleProgressBar();
        //设置进度条初始颜色
        bar.setBackgroundColor(ColorUtil.pinkColor);
        //遍历改变颜色
        GUIUtil.setColor(ColorUtil.grayColor, vAvgSpendPerDay, vMonthAvailable, vDayAvgAvailable, vMonthLeftDay);
        GUIUtil.setColor(ColorUtil.greenColor, lAvgSpendPerDay, lDayAvgAvailable);
        GUIUtil.setColor(ColorUtil.redColor, lMonthLeft, lMonthLeftDay);
        GUIUtil.setColor(ColorUtil.cyanColor, lMonthSpend, lTodaySpend);
        GUIUtil.setColor(ColorUtil.pinkColor, vMonthSpend, vTodaySpend);


        //设置字体
        lMonthSpend.setFont(new Font("", Font.BOLD, 24));
        vMonthSpend.setFont(new Font("", Font.BOLD, 20));
        lTodaySpend.setFont(new Font("", Font.BOLD, 24));
        vTodaySpend.setFont(new Font("", Font.BOLD, 20));

        //规划布局
        this.add(center(), BorderLayout.CENTER);
        this.add(north(), BorderLayout.NORTH);

    }

    private JPanel center() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(east(), BorderLayout.EAST);
        p.add(center2(), BorderLayout.CENTER);

        return p;
    }

    private Component center2() {
        return bar;
    }

    private Component east() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 1));
        p.add(lMonthSpend);
        p.add(vMonthSpend);
        p.add(lTodaySpend);
        p.add(vTodaySpend);
        return p;
    }

    private JPanel north() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 4));

        p.add(lAvgSpendPerDay);
        p.add(lMonthLeft);
        p.add(lDayAvgAvailable);
        p.add(lMonthLeftDay);
        p.add(vAvgSpendPerDay);
        p.add(vMonthAvailable);
        p.add(vDayAvgAvailable);
        p.add(vMonthLeftDay);

        return p;
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(SpendPanel.instance);
    }

}
