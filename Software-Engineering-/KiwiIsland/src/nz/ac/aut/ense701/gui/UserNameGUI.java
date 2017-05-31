package nz.ac.aut.ense701.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import nz.ac.aut.ense701.gameModel.Game;

public class UserNameGUI extends JFrame implements ActionListener{
	JButton jb1,jb2;
	JTextField jtf;
	JLabel jl1,jl2;
	JPanel jp1,jp2,jp3;
	public String nplayer;
	public Boolean getName = false;

	public UserNameGUI(){
		
		nplayer ="";
		jb1 = new JButton("Save");
		jb2 = new JButton("Cancel");
		jtf = new JTextField(10);
		jl1 = new JLabel("User Name");
		jl2 = new JLabel(new ImageIcon("kiwi3.jpg"));
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jp1.add(jl2);
		this.add(jp1);
		
		jp2.add(jl1);
		jp2.add(jtf);
		jp2.add(jb1);
		jb1.addActionListener(this);
		jb1.setActionCommand("save");
		jp2.add(jb2);
		jb2.addActionListener(this);
		jb2.setActionCommand("cancel");
		
		this.add(jp2,BorderLayout.SOUTH);
		
		this.setTitle("User Name GUI");
		this.setLocation(300, 300);
		this.setSize(400, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

        
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("save"))
		{
			nplayer = jtf.getText();
			System.out.println(nplayer);
			getName = true;
                        this.dispose();
		}
		else if(e.getActionCommand().equals("cancel"))
		{
			this.dispose();
		}
	}
        public boolean isempty(){
            return getName;
        }
        public String getPlayerName(){
            return nplayer;
        }
}



