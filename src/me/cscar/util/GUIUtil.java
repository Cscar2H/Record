package me.cscar.util;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.InputStream;

public class GUIUtil {

    private static String imageFolder = "/Users/cscar/IdeaProjects/wolfCode/pocketbook/img";

    /**
     * 按钮图标和提示文字
     * @param b
     * @param fileName
     * @param tip
     */
    public static void setImageIcon(JButton b, String fileName, String tip) {
        ImageIcon i = new ImageIcon(new File(imageFolder, fileName).getAbsolutePath());
        b.setIcon(i);
        b.setPreferredSize(new Dimension(100, 100));
        b.setToolTipText(tip);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setHorizontalTextPosition(JButton.CENTER);
        b.setText(tip);
    }

    /**
     * 给组件设置颜色
     * @param color
     * @param cs
     */
    public static void setColor(Color color, JComponent... cs) {
        for (JComponent c : cs) {
            c.setForeground(color);
        }
    }

    /**
     * @param p
     * @param strechRate 拉伸比例1表示满屏幕
     */
    public static void showPanel(JPanel p, double strechRate) {
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(strechRate);
        f.setContentPane(cp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        cp.show(p);
    }

    public static void showPanel(JPanel p) {
        showPanel(p, 0.85);
    }

    /**
     * 判断一个组件内容是否是数字格式
     * @param tf
     * @param input
     * @return
     */
    public static boolean checkNumber(JTextField tf, String input) {
        if (!checkEmpty(tf, input))
            return false;
        String text = tf.getText().trim();
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, input + " 只能是整数");
            tf.grabFocus();
            return false;
        }
    }

    /**
     * 判断一个组件的内容是否为零
     * @param tf
     * @param input
     * @return
     */
    public static boolean checkZero(JTextField tf, String input) {
        if (!checkNumber(tf, input)) {
            return false;
        }
        String text = tf.getText().trim();

        if (0 == Integer.parseInt(text)) {
            JOptionPane.showMessageDialog(null, input + " 不能为零");
            tf.grabFocus();
            return false;
        }
        return true;
    }

    /**
     * 判断输入框内容是否是空
     * @param tf
     * @param input
     * @return
     */
    public static boolean checkEmpty(JTextField tf, String input) {
        String text = tf.getText().trim();
        if (0 == text.length()) {
            JOptionPane.showMessageDialog(null, input + " 不能为空");
            tf.grabFocus();
            return false;
        }
        return true;

    }

    public static int getInt(JTextField tf) {
        return Integer.parseInt(tf.getText());
    }
}
