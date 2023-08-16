
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot robt = new Robot();
		robt.setX(30);
		robt.turn(90);
		int angle = 144;
		for(int y =0; y <10; y++) {
		for(int x = 0; x <5; x++) {
			robt.penDown();
			robt.setPenWidth(2);
			robt.setSpeed(50);
		robt.turn(angle);
		robt.move(30);
		}
		robt.penUp();
	
		robt.move(50);
		}
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.

		// 2. Make the robot draw a star shape. Hint: angle=144.

		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
