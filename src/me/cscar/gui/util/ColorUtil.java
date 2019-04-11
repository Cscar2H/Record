package me.cscar.gui.util;

import java.awt.*;

public class ColorUtil {
    public static Color pinkColor = Color.decode("#FF99C2");
    public static Color blueColor = Color.decode("#3399FF");
    public static Color greenColor = Color.decode("#26FF42");
    public static Color redColor = Color.decode("#FF2677");
    public static Color cyanColor = Color.decode("#3FC1C9");
    public static Color grayColor = Color.decode("#999999");
    public static Color backgroundColor = Color.decode("#eeeeee");
    public static Color warningColor = Color.decode("#FF3333");

    /**
     * 根据进度显示不同的颜色
     *
     * @param per
     * @return
     */
    public static Color getByPercentage(int per) {
        if (per > 100) {
            per = 100;
        }
        int r = 51;
        int g = 255;
        int b = 51;
        float rate = per / 100f;
        r = (int) ((255 - 51) * rate + 51);
        g = 255 - r + 51;
        Color color = new Color(r, g, b);
        return color;
    }
}
