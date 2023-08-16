import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseMotionListenerEx extends JFrame implements MouseMotionListener {
	public MouseMotionListenerEx(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("MouseMotionListener");
		setLayout(null);
		setSize(500,500);

		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent m){
		System.out.println("Mouse Dragged At "+m.getX()+","+m.getY());
	}
	public void mouseMoved(MouseEvent m){
		System.out.println("Mouse Moved At "+m.getX()+","+m.getY());
	}
	public static void main(String[] args) {
		new MouseMotionListenerEx();
	}
}