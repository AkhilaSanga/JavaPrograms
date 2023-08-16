import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class MouseListenerEmoji extends JFrame implements MouseListener {
	JLabel label;

	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon pain;
	ImageIcon dizzy;
	ImageIcon angry;
	public MouseListenerEmoji(){
		setVisible(true);
		setTitle("MouseListenerDemo");
		setLayout(new FlowLayout());
		setSize(500,500);
		addMouseListener(this);	

		smile = new ImageIcon("D://AJP//Img//smile.jpg");
		nervous = new ImageIcon("D://AJP//Img//nervous.jpg");
		pain = new ImageIcon("D://AJP//Img//pain.jpg");
		dizzy = new ImageIcon("D://AJP//Img//dizzy.jpg");
		angry = new ImageIcon("D://AJP//Img//angry.jpg");

		label=new JLabel(); 

		label.setBounds(0,0,100,100);
		label.setOpaque(true);
		add(label);
		//Registering the listener to the source
		label.addMouseListener(this);
	}
	public void mouseEntered(MouseEvent e){
		System.out.println("User has entered on Frame");
		//label.setBackground(Color.blue);
		label.setIcon(smile);
	}
	public void mouseExited(MouseEvent e){
		System.out.println("User has exited from Frame");
		//label.setBackground(Color.red);
		label.setIcon(pain);
	}
	public void mousePressed(MouseEvent e){
		System.out.println("User has Pressed the Mouse");
		//label.setBackground(Color.yellow);
		label.setIcon(dizzy);
	}
	public void mouseReleased(MouseEvent e){
		System.out.println("User has Released the Mouse");
		//label.setBackground(Color.green);
		label.setIcon(angry);
	}
	public void mouseClicked(MouseEvent e){
		System.out.println("User has completed mouse press and mouse released");
		//label.setBackground(Color.pink);
		label.setIcon(nervous);
	}
	public static void main(String args[]){
		MouseListenerEmoji m=new MouseListenerEmoji();
	}
}