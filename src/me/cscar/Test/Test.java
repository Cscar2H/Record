package me.cscar.Test;

import me.cscar.gui.util.GUIUtil;

import javax.swing.*;

/**
 * 测试调用showPanel方法
 */
public class Test {
    public static void main(String[] args) {
        JPanel p = new JPanel();
        p.add(new JButton("按钮1"));
        p.add(new JButton("按钮2"));
        GUIUtil.showPanel(p);

    }
}
