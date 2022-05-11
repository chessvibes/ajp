// 7 add sub clear
import java.awt.*;        // Using AWT's layouts
import java.awt.event.*;  // Using AWT's event classes and listener interfaces
import javax.swing.*;     // Using Swing's components and container
//A Swing application extends from javax.swing.JFrame
public class swingadder extends JFrame {
	 JTextField tfNumber1, tfNumber2, tfResult;
	    JButton btnAdd,btnSub, btnClear;
	   int number1, number2, result;
	   String s1;
	// Constructor to set up UI components and event handlers
	   public swingadder() {
		// Swing components should be added to the content-pane of the JFrame.
		      Container cp = getContentPane();
		      // Set this Container to grid layout of 4 rows and 2 columns
		      cp.setLayout(new GridLayout(4, 2, 10, 3));
		 
		      // Components are added from left-to-right, top-to-bottom
		      cp.add(new JLabel("First Number "));     // at (1, 1)
		      tfNumber1 = new JTextField();
		      tfNumber1.setHorizontalAlignment(JTextField.RIGHT);
		      cp.add(tfNumber1); 
		      cp.add(new JLabel("Second Number ")); 
		      tfNumber2 = new JTextField();
		      tfNumber2.setHorizontalAlignment(JTextField.RIGHT);
		      cp.add(tfNumber2);
		      cp.add(new JLabel("Result "));     // at (1, 1)
		      tfResult = new JTextField();
		      tfResult.setHorizontalAlignment(JTextField.RIGHT);
		      cp.add(tfResult); 
		     
		      
		      // at (1, 2)
		      btnAdd = new JButton("ADD");
		      cp.add(btnAdd);                         // at (4, 1)
		      btnAdd.addActionListener(new ActionListener() {
		         @Override
		         public void actionPerformed(ActionEvent evt) {
		            number1 = Integer.parseInt(tfNumber1.getText());
		            number2 = Integer.parseInt(tfNumber2.getText());
		            result=number1+number2;
		            s1=String.valueOf(result);
		            tfResult.setText(s1);  
		         }
		      });
		      btnSub = new JButton("SUB");
		      cp.add(btnSub);                         // at (4, 1)
		      btnSub.addActionListener(new ActionListener() {
		 
		         public void actionPerformed(ActionEvent evt) {
		            number1 = Integer.parseInt(tfNumber1.getText());
		            number2 = Integer.parseInt(tfNumber2.getText());
		            result=number1-number2;
		            s1=String.valueOf(result);
		            tfResult.setText(s1);  
		         }
		      });
		      btnClear = new JButton("CLEAR");
		      cp.add(btnClear);                          // at (4, 2)
		      btnClear.addActionListener(new ActionListener() {
		        
		         public void actionPerformed(ActionEvent evt) {
		        	 tfNumber1.setText("");
		        	 tfNumber2.setText("");
		        	 tfResult.setText("");
		         }
		      });
		      
		      setTitle("Swing Adder");
		      setSize(300, 170);
		      setVisible(true);
		      
	   }
	   public static void main(String[] args) {
		            new swingadder(); // Let the constructor does the job
		         }     
       }
