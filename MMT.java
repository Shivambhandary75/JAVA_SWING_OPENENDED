package project;


import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MMT extends JFrame implements MouseListener {
	JLabel lb1;
	@SuppressWarnings("unused")
	MMT(){
     JFrame frame = new JFrame();
     this.setSize(400,400);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setLayout(null);
   lb1=new JLabel("Hello SJEC");
     lb1.setBounds(150,150,250,25);
     this.add(lb1);
     this.addMouseListener(this);
     this.setVisible(true);
	}
     public static void main(String[] args) {
	    MMT m=new MMT();

	}
	
	public void mouseClicked(MouseEvent e) {
		lb1.setText("Mouse Clicked at X="+e.getX()+" Y="+e.getY());
	}
		
	
	
	public void mousePressed(MouseEvent e) {
		
		lb1.setText("Mouse Pressed at X="+e.getX()+" Y="+e.getY());
	}
	
	public void mouseReleased(MouseEvent e) {
		lb1.setText("Mouse Released");
		
	}
	
	public void mouseEntered(MouseEvent e) {
		lb1.setText("Mouse Entered at X="+e.getX()+" Y="+e.getY());
		
	}
	
	public void mouseExited(MouseEvent e) {
		
		lb1.setText("Mouse Exited at X="+e.getX()+" Y="+e.getY());
	}
     

}
