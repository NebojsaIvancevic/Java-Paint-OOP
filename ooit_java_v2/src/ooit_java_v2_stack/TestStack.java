package ooit_java_v2_stack;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ooit_java_v2_drawing.Rectangle;

public class TestStack implements ActionListener, MouseListener {
	private JFrame jFrame;
	private JList<Rectangle> jList;
	private JButton button2;
	private JButton buttonObrisi;
	private DefaultListModel<Rectangle> DLM = new DefaultListModel<Rectangle>();
	
	public TestStack() {
		jFrame = new JFrame();
		button2 = new JButton("Klikni za modalni dialog");
		button2.addActionListener(this);
		
		buttonObrisi = new JButton("Obrisi sa steka");
		buttonObrisi.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Brise");
			
				// Implementirati da brise po unetim vrednostima iz dialog boxa
			}
			
		});
		
		jList = new JList<Rectangle>();
		
		
		JPanel jPanel = new JPanel();
		jPanel.add(button2);
		jPanel.add(jList);
		jPanel.add(buttonObrisi);
		jPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		jPanel.setLayout(new GridLayout());
		
		
		jFrame.add(jPanel, BorderLayout.CENTER);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setTitle("STEK");
		jFrame.pack();
		jFrame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {	
		new TestStack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			double kracaStranica = Double.parseDouble(JOptionPane.showInputDialog("Unesite stranicu a"));
			double duzaStranica = Double.parseDouble(JOptionPane.showInputDialog("Unesite stranicu b"));
			DLM.addElement(new Rectangle(duzaStranica,kracaStranica));
			jList.setModel(DLM);
			// implementirati da moze da se doda vise kroz neku petlju ili kako vec
		}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		e.getComponent();
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
	}
