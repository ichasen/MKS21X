import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class cfcConvertor extends JFrame implements ActionListener{
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
    public void actionPerformed(ActionEvent e){
	String s = e.getActionCommand();
	System.out.println(s);
	if (s.equals("Convert")){
	    if (c.isSelected()){
		      t.setText(Double.toString(CtoF(Double.parseDouble(t.getText()))));
	    }
	    if (f.isSelected()){
		      t.setText(Double.toString(FtoC(Double.parseDouble(t.getText()))));
	    }
	    else{
		      t.setText("What do you want?");
	    }
	}
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
