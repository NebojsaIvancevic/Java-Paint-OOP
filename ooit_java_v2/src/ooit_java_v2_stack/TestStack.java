package ooit_java_v2_stack;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ooit_java_v2_drawing.Point;
import ooit_java_v2_drawing.Rectangle;

public class TestStack extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JList<Rectangle> list;
	private JButton btnAdd;
	private JButton btnDelete;
	private DefaultListModel<Rectangle> DLM;
	JDialog dialog;

	public TestStack() {
		// Default list model
		DLM = new DefaultListModel<Rectangle>();
		// JList
		list = new JList<Rectangle>();
		// frame
		frame = new JFrame("Stack");
		// Panel
		JPanel panel = new JPanel();

		// Add Button
		btnAdd = new JButton("Add Rectange to the Stack");
		btnAdd.addActionListener(this);
		// Delete Button
		btnDelete = new JButton("Remove from stack");
		btnDelete.addActionListener(this);

		// ADding to the panel
		panel.add(btnAdd);
		panel.add(list);
		panel.add(btnDelete);
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout());

		frame.setSize(420, 420);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAdd) {
			// Or JDialog
			int tackaA = Integer.parseInt(JOptionPane.showInputDialog("Unesite tacku A"));
			int tackaB = Integer.parseInt(JOptionPane.showInputDialog("Unesite tacku B"));
			int height = Integer.parseInt(JOptionPane.showInputDialog("Unesite visinu"));
			int width = Integer.parseInt(JOptionPane.showInputDialog("Unesite sirinu"));
			DLM.add(0, new Rectangle(new Point(tackaA, tackaB), height, width));
			list.setModel(DLM);
		}
		if (e.getSource() == btnDelete) {
			try {
				// System.out.println(list.getSelectedValue());
				// Also can be done through JDialog
				JTextField field1 = new JTextField(list.getSelectedValue().getUpperLeftPoint().toString());
				JTextField field2 = new JTextField(Integer.toString(list.getSelectedValue().getHeight()));
				JTextField field3 = new JTextField(Integer.toString(list.getSelectedValue().getWidth()));
				Object[] fields = { "Tacka", field1, "Visina", field2, "Sirina", field3 };
				int result = JOptionPane.showConfirmDialog(null, fields, "Delete rectangle with these values?",
						JOptionPane.OK_CANCEL_OPTION);
				if (result == JOptionPane.OK_OPTION) {
					DLM.removeElement(list.getSelectedValue());
				} else {
					System.out.println("You have cancelled");
				}
			} catch (NullPointerException ex) {
				System.out.println("No rectangle is selected");
			}
		}
	}
	public static void main(String[] args) {
		new TestStack();
	}

}
