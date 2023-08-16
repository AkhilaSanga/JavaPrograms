import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;

public class MouseMotionListenerEx2 extends JFrame implements MouseMotionListener {
	TextArea ta;
	public MouseMotionListenerEx2(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("MouseMotionListener");
		setLayout(null);
		setSize(500,500);

		ta = new TextArea();
		ta.setBounds(100,100,300,500);
		add(ta);
		ta.addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent m){
		System.out.println("Mouse Dragged At "+m.getX()+","+m.getY());
		ta.setText("Mouse Dragged At "+m.getX()+","+m.getY());
	}
	public void mouseMoved(MouseEvent m){
		System.out.println("Mouse Moved At "+m.getX()+","+m.getY());
		ta.setText("Mouse Moved At "+m.getX()+","+m.getY());
	}
	public static void main(String[] args) {
		new MouseMotionListenerEx2();
	}
}