
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robt = new Robot(); 
		robt.penDown();
		robt.setPenWidth(10);
		String re = "How many sides";
		String go = JOptionPane.showInputDialog(null,re);
		int va = Integer.parseInt(go);
		for(int x=0; x<va; x++) {
		String cool = "What color would you like?";
		String color = JOptionPane.showInputDialog(null,cool);
	
		if(color.equals("green")) {
			robt.setPenColor(0,250,0);
		}
		else if(color.equals("gray")) {
			robt.setPenColor(200,200,200);
		}
		else if(color.equals("red")) {
			robt.setPenColor(250,80,80);
		}
		else if (color.equals("pink")) {
			robt.setPenColor(250,80,800);
		}
		else {
			Random trtrtr = new Random();
			int ran = trtrtr.nextInt(255);
			Random dr = new Random();
			int r = dr.nextInt(255);
			Random drx = new Random();
			int y = drx.nextInt(255);
			robt.setPenColor(ran,r,y);
		}
	
		robt.setSpeed(100);
		//int sides = 3;
			
		int angle = 360/va;
		//  LOOP. Start a while loop to repeat the DRAW, TURN, and INCREASE COUNT code 200 times. 
	robt.move(100);
robt.turn(angle+1);
				//  INCREASE COUNT. Increase the count by 1
		//  End the while loop here
	}

	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
