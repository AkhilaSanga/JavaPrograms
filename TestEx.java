import java.awt.*;
import java.applet.*;
public class TestEx{
	TestEx(){
		Frame f=new Frame();
		Label l=new Label("Welcome to Concept Engineering Classes");
		l.setBounds(0,10,100,50);
		f.add(l);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		TestEx t=new TestEx();
	}
}