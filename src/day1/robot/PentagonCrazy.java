package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
Robot superman=new Robot();
	
superman.penDown();

superman.setSpeed(10);
		
superman.setPenColor(Color.black);
		
int sides=20;
		
int turn=60;
	superman.turn(turn);
		
for (int i = 0; i < 200; i++) 
{	superman.move(i);

	superman.turn(turn+i);
}
		
			
	
			
			

	}

	// Variations:
	// *12. make the pattern really huge
	
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}