import javax.swing.*;
import java.awt.*;
public class cfcConvertor extends JFrame{
    private Container pane;
    private JButton b;
    private JTextField t;
    private JCheckBox c;
    private JCheckBox f;
    public cfcConvertor(){
	      this.setTitle("Celsius, Fahrenheit convertor");
	      this.setSize (200,200);
	      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	      pane = this.getContentPane();
	      pane.setLayout(new FlowLayout());
	      b = new JButton("Convert");
	      t = new JTextField(15);
	      c = new JCheckBox ("Celsius?");
	      f = new JCheckBox ("Fahrenheit?");
	      pane.add(b);
	      pane.add(t);
	      pane.add(c);
	      pane.add(f);
    }
    public static double CtoF (double t){
	      return (t * 1.8) + 32;
    }
    public static double FtoC (double t){
	      return (t-32) / 1.8;
    }
    public static void main(String[] args){
	      cfcConvertor x = new cfcConvertor();
	      x.setVisible(true);
    }
}
