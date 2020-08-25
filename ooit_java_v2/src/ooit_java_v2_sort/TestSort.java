package ooit_java_v2_sort;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListModel;

import ooit_java_v2_drawing.Point;
import ooit_java_v2_drawing.Rectangle;

public class TestSort implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JButton sortButton;
	private JButton btnAdd;
	private JList<Rectangle> list;
	//private ArrayList<Rectangle> recList;
	private DefaultListModel<Rectangle> DLM;
	
	public TestSort() {
		DLM = new DefaultListModel<Rectangle>();
		frame = new JFrame("SORT");
		panel = new JPanel();
		sortButton = new JButton("Sort Rectangles By Area");
		btnAdd = new JButton("Add new Rectangle");
		list = new JList<Rectangle>();
		
		
		sortButton.addActionListener(this);
		btnAdd.addActionListener(this);
		
		panel.add(sortButton);
		panel.add(btnAdd);
		panel.add(list);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void sortList(JList<Rectangle> list){
		ListModel<Rectangle> model = list.getModel();
		
		int n = model.getSize();
		Rectangle[] data = new Rectangle[n];
		
		for(int i = 0; i<n; i++) {
			data[i] = (Rectangle)model.getElementAt(i);
		}
		// Descending order
		Arrays.sort(data, new Comparator<Rectangle>() {
		public int compare(Rectangle r1, Rectangle r2) {
			return Integer.valueOf((int)r2.area()).compareTo((int)r1.area());
			
		}
			
		});
		list.setListData(data);
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnAdd) {
			// Or JDialog
			int tackaA = Integer.parseInt(JOptionPane.showInputDialog("Unesite tacku A"));
			int tackaB = Integer.parseInt(JOptionPane.showInputDialog("Unesite tacku B"));
			int height = Integer.parseInt(JOptionPane.showInputDialog("Unesite visinu"));
			int width = Integer.parseInt(JOptionPane.showInputDialog("Unesite sirinu"));
			DLM.addElement(new Rectangle(new Point(tackaA, tackaB), height, width));
			list.setModel(DLM);
		}
		if (e.getSource() == sortButton) {
			
			sortList(list);
		}
	}
	
	
	
public static void main(String[] args) {
		
		new TestSort();
	}

}
