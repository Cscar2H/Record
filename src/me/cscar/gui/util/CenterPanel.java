package me.cscar.gui.util;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    /**
     * 拉伸比例
     */
    private double rate;
    /**
     * 显示的组件
     */
    private JComponent c;
    /**
     * 是否拉伸
     */
    private boolean strech;

    /**
     * @param rate 表示拉伸比例,1就是填满,0.5就是填一半
     * @param strech 是否拉伸
     */
    public CenterPanel(double rate, boolean strech) {
        this.setLayout(null);
        this.rate = rate;
        this.strech = strech;
    }

    /**
     * 构造器重载
     * @param rate
     */
    public CenterPanel(double rate) {
        this(rate, true);
    }

    @Override
    public void repaint() {
        if (null != c) {
            Dimension containerSize = this.getSize();
            Dimension componentSize = c.getPreferredSize();

            if (strech) {
                c.setSize((int) (containerSize.width * rate), (int) (containerSize.height * rate));
            } else {
                c.setSize(componentSize);
            }

            c.setLocation(containerSize.width / 2 - c.getSize().width / 2, containerSize.height / 2 - c.getSize().height / 2);
        }
        super.repaint();
    }

    /**
     * 使用show方法显示组件
     * @param p
     */
    public void show(JComponent p) {
        this.c = p;
        Component[] cs = getComponents();
        for (Component c : cs) {
            remove(c);
        }
        add(p);
        this.updateUI();
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(200, 200);
        f.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(0.90, true);
        f.setContentPane(cp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        JButton b = new JButton("nmsl");
        cp.show(b);

    }
}
