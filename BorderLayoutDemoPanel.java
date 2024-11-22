package sheet2.questions;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BorderLayoutDemoPanel extends JFrame{
	public static void main(String[] args) {
		BorderLayoutDemoPanel bld = new BorderLayoutDemoPanel();
		bld.setVisible(true);
		bld.setSize(400,500);
		bld.pack();
		bld.setTitle("Border Layout");
		
		
	}

	JButton jb1 = null;
	JButton jb2 = null;
	JButton jb3 = null;
	JButton jb4 = null;
//	JButton jb5 = null;
	JLabel j1 = null;
	JTextArea jta = null;
	JTextField jtf = null;
	JPanel pflow = null;
	JPanel pgrid = null;
	public BorderLayoutDemoPanel() {
		
		jb2 = new JButton("West");
		add(jb2, BorderLayout.WEST);
		jb3 = new JButton("South");
		add(jb3, BorderLayout.SOUTH);
		jb4 = new JButton("East");
		add(jb4, BorderLayout.EAST);
		
		
		pflow = new JPanel();
		pflow.setLayout(new FlowLayout());
		jta = new JTextArea(10,10);
		jtf = new JTextField(10);
		JLabel jl = new JLabel("Welcome");
		pflow.add(jtf);
		pflow.add(jta);
		pflow.add(jl);
		
		
		pgrid = new JPanel();
		pgrid.setLayout(new GridLayout(3,3));
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				pgrid.add(new JButton("I"+(i+j)));
				
			}
		}
		add(pgrid,BorderLayout.CENTER);
		add(pflow,BorderLayout.NORTH);
		
		
	}
	
	

}
