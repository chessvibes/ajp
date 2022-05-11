//10 vote dialog
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class voteballot extends JFrame{
	JRadioButton rb1,rb2,rb3;
	JButton btnvote;
	JLabel L1;
	ButtonGroup G1;
	public voteballot() {
		this.setLayout(null);
		  
        // Initialization of object of "JRadioButton" class.
        rb1 = new JRadioButton();
  
        // Initialization of object of "JRadioButton" class.
        rb2 = new JRadioButton();
        
        // Initialization of object of "JRadioButton" class.
        rb3 = new JRadioButton();
        
        G1 = new ButtonGroup();
        
        // Initialization of object of "JButton" class.
        btnvote = new JButton("Click");
        
        L1 = new JLabel("Voting");
        
     // Setting text of "jRadioButton1".
        rb1.setText("Party One");
  
        // Setting text of "jRadioButton2".
        rb2.setText("Party Two");
        
        // Setting text of "jRadioButton3".
        rb3.setText("Party Three");
        
     // Setting Bounds of "jRadioButton1".
        rb1.setBounds(120, 30, 120, 50);
  
        // Setting Bounds of "jRadioButton2".
        rb2.setBounds(250, 30, 80, 50);
        
     // Setting Bounds of "jRadioButton3".
        rb3.setBounds(300, 30, 60, 50);
        
     // Setting Bounds of "jButton".
        btnvote.setBounds(125, 90, 80, 30);
  
        // Setting Bounds of JLabel "L2".
        L1.setBounds(20, 30, 150, 50);
        
     // "this" keyword in java refers to current object.
        // Adding "jRadioButton2" on JFrame.
        this.add(rb1);
  
        // Adding "jRadioButton4" on JFrame.
        this.add(rb2);
   
     // Adding "jRadioButton4" on JFrame.
        this.add(rb3);
        
        // Adding "jButton" on JFrame.
        this.add(btnvote);
  
        // Adding JLabel "L2" on JFrame.
        this.add(L1);
        
     // Adding "jRadioButton1" and "jRadioButton3" in a Button Group "G2".
        G1.add(rb1);
        G1.add(rb2);
        G1.add(rb3);
	
	 
//Adding Listener to JButton.
btnvote.addActionListener(new ActionListener() {
    // Anonymous class.

    public void actionPerformed(ActionEvent e)
    {
        

        // Declaration of String class Objects.
        String vote = " ";

        // If condition to check if jRadioButton2 is selected.
        if (rb1.isSelected()) {

            vote = "PARTY ONE";
        }

        else if (rb2.isSelected()) {

            vote = "PARTY TWO";
        }
        else if (rb3.isSelected()) {
        	vote = "PARTY THREE";
        }
        else {

            vote = "NO party selected";
        }
     // MessageDialog to show information selected radion buttons.
        JOptionPane.showMessageDialog(voteballot.this, vote);
    }
});
}
 }
class RadioButton {
    // Driver code.
    public static void main(String args[])
    { // Creating object of demo class.
        voteballot f = new voteballot();
  
        // Setting Bounds of JFrame.
        f.setBounds(100, 100, 400, 200);
  
        // Setting Title of frame.
        f.setTitle("RadioButtons");
  
        // Setting Visible status of frame as true.
        f.setVisible(true);
    }
    }