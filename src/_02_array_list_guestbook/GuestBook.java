package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addNameBtn = new JButton();
	JButton viewNameBtn = new JButton();
	ArrayList<String> stringArr = new ArrayList<String>();
	
	public void run() {
		frame.setVisible(true);
		panel.add(addNameBtn);
		panel.add(viewNameBtn);
		frame.add(panel);
		addNameBtn.setText("Add Name");
		viewNameBtn.setText("View Names");
		addNameBtn.addActionListener(this);
		viewNameBtn.addActionListener(this);
		frame.pack();
	}
	
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.run();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(addNameBtn)) {
			String input = JOptionPane.showInputDialog("Enter a name:");
			stringArr.add(input);
		}
		else if (e.getSource().equals(viewNameBtn)) {
			for (int i = 0; i < stringArr.size(); i++) {
				System.out.println("Guest #" + (i+1) + ": " + stringArr.get(i));
			}
		}
	}
}
