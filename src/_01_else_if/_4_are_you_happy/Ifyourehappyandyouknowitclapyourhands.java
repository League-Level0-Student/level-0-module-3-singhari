package _01_else_if._4_are_you_happy;
import javax.swing.JOptionPane;
public class Ifyourehappyandyouknowitclapyourhands {
	public static void main(String args[]) {
		String re = "Are you happy?";
		String go = JOptionPane.showInputDialog(null,re);
		if(go.toLowerCase().equals("yes")) {
			String yes = "Keep doing whatever you're doing.";
			JOptionPane.showMessageDialog(null,yes);
		}
		if (go.toLowerCase().equals("no")) {
			String noe = "Do you want to be happy?";
		String er=	JOptionPane.showInputDialog(null,noe);
				if(er.toLowerCase().equals("yes")) {
					String yes = "Change something.";
					JOptionPane.showMessageDialog(null,yes);
			
								}
				if(er.toLowerCase().equals("no")) {
					String yes = "keep doing whatever you're doing.";
					JOptionPane.showMessageDialog(null,yes);
			
								}
		}
	}
}