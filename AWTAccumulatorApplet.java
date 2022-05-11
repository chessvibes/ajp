//6 awt accumulater
import java.applet.Applet;
import java.awt.*;        // Using AWT's containers and components
import java.awt.event.*;  // Using AWT's event classes and listener interfaces
 
// An applet extends java.applet.Applet
public class AWTAccumulatorApplet extends Applet implements ActionListener {
   private TextField tfInput;   // The input TextField
   private int sum = 0;         // The accumulated sum, init to 0
 
   // init() runs when the applet is loaded. Setup the UI components and event handlers.
   public void init() {
      add(new Label("Enter an integer"));  // anonymous Label
 
      tfInput = new TextField(10);
      add(tfInput);
      tfInput.addActionListener(this);
         // Hitting enter key on tfInput invokes actionPerformed()
   }
 
   // ActionEvent handler - Called back when enter key was hit on TextField.
   public void actionPerformed( ActionEvent evt) {
      int numberIn = Integer.parseInt(evt.getActionCommand());
         // getActionCommand() returns the String entered.
      sum += numberIn;
      tfInput.setText("");  // Clear input TextField
      showStatus("The accumulated sum is: " + sum);
         // show the sum on the status bar of the browser's window
   }
}