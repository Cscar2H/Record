package me.cscar.gui.panel;
 
import me.cscar.gui.model.CategoryTableModel;
import me.cscar.gui.util.ColorUtil;
import me.cscar.gui.util.GUIUtil;

import java.awt.BorderLayout;
 
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
 

 
public class CategoryPanel extends JPanel{

    public static CategoryPanel instance = new CategoryPanel();
 
    public JButton bAdd = new JButton("新增");
    public JButton bEdit = new JButton("编辑");
    public JButton bDelete = new JButton("删除");
    String columNames[] = new String[]{"分类名称","消费次数"};
     
    public CategoryTableModel ctm = new CategoryTableModel();
    public JTable t =new JTable(ctm);
     
    public CategoryPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bAdd,bEdit,bDelete);
        JScrollPane sp =new JScrollPane(t);
        JPanel pSubmit = new JPanel();
        pSubmit.add(bAdd);
        pSubmit.add(bEdit);
        pSubmit.add(bDelete);
         
        this.setLayout(new BorderLayout());
        this.add(sp,BorderLayout.CENTER);
        this.add(pSubmit,BorderLayout.SOUTH);
    }
 
    public static void main(String[] args) {
        GUIUtil.showPanel(CategoryPanel.instance);
    }
     
}