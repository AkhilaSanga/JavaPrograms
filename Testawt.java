import java.awt.*;
public class Testawt{
	Testawt(){
		Frame f=new Frame();
		Label l=new Label("Welcome to Java Graphics");
		l.setBounds(10,10,100,50);
		f.add(l);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		Testawt t=new Testawt();
	}
}