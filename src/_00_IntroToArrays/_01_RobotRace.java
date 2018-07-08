package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
		
		
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
		}
			//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			robots[i].setX(0);
			robots[i].setY(300);
			robots[i].setSpeed(10);
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		Random randy = new Random();
		boolean x = true;
    		String winner = "";
		while(x) {
		for (int i = 0; i < robots.length; i++) {
			int y = randy.nextInt(50);
			for (int j = 0; j < y; j++) {
				robots[i].move(3);
				robots[i].turn(1);
			
				if(robots[i].getY()==300&&robots[i].getX()==0) {
					x=false;
					winner = "Robot "+(i+1)+ " is the winner!!";
				}
			}
			}
    		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
    			//DONE
		//7. declare that robot the winner and throw it a party!
    			JOptionPane.showMessageDialog(null, winner);
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	}
}
