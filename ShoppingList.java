//Two things to be implemented in thi scode first to know how to add custome list from user and second is how to lock frame size
package sheet2.questions;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ShoppingList extends JFrame implements ItemListener{
	public static void main(String[] args) {
		ShoppingList sl = new ShoppingList();
		sl.setVisible(true);
		sl.setSize(550,550);
		sl.setTitle("Welcome to you To-Do Planner");
//		JFrame.s
		
		sl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	JCheckBox cb1,cb2,cb3,cb4,cb5;
	ButtonGroup bg;
	JTextArea jta;
	java.awt.Container c = null;
	public ShoppingList() {
		 setLayout(new FlowLayout());
		cb1 = new JCheckBox("Books");
//		Scanner sc = new Scanner(System.in);
		cb2 = new JCheckBox("Pens");
		cb3 = new JCheckBox("Pencil");
		cb4 = new JCheckBox("Notebooks");
		cb5 = new JCheckBox("Magazine");
		bg = new ButtonGroup();
//		bg.add(cb1);
//		bg.add(cb2); 
//		bg.add(cb3);
//		bg.add(cb4);
//		bg.add(cb5);
		jta = new JTextArea(50,50);
		jta.setBackground(Color.GRAY);
		c = getContentPane();
		
		
		c.add(cb1);
		c.add(cb2);
		c.add(cb3);
		c.add(cb4);
		c.add(cb5);
		c.add(jta);
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String msg ="";
		if(cb1.isSelected()) {
			msg = msg + "\n"+cb1.getText();
			
		}
		if(cb2.isSelected()) {
			msg = msg + "\n"+cb2.getText();
			
		}
		if(cb3.isSelected()) {
			msg = msg + "\n"+cb3.getText();
			
		}
		if(cb4.isSelected()) {
			msg = msg + "\n"+cb4.getText();
			
		}
		if(cb5.isSelected()) {
			msg = msg + "\n"+cb5.getText();
			
		}
		jta.setText(msg);
		msg = "";
		
	}
}
