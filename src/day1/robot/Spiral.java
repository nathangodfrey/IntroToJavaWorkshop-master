package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot c3po=new Robot();
		
c3po.penDown();
		
c3po.setSpeed(10);
		
for (int i = 0; i < 75; i++) {
	


		
	c3po.setRandomPenColor();

	c3po.move(5*i);
			
	c3po.turn(360/7);
		
	
			
c3po.setPenWidth(i);}


	}
}
