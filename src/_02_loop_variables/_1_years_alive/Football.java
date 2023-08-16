package _02_loop_variables._1_years_alive;
import javax.swing.JOptionPane;
public class Football {
	public static void main(String args[]) {
		int year = 2008;
		String yearlist = year+"\n";
for(int x = 2008; x < 2023; x++) {
//String re = ""+year;
	year++;
	yearlist=yearlist+year +"\n";
}	
JOptionPane.showMessageDialog(null,yearlist);
	}
}
