import acm.program.*;
import acm.graphics.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	
	//Number of circles 
	private static final int NUMBER_OF_CIRCLES = 10;
	
	private static final double MIN_RADIUS = 5;
	private static final double MAX_RADIUS = 50;
	
	
	public void run() {
		
		//create a new circle for each of the given number of times
		RandomGenerator generate = RandomGenerator.getInstance();
		for (int i = 0; i < NUMBER_OF_CIRCLES; i++) {
			
			//generate a random radius for the circle;
			double r = generate.nextDouble(MIN_RADIUS, MAX_RADIUS);
			//to save steps in later uses for r*2
			double diam = r * 2;
			
			/* NOTE: each circle's x/y-axis is the upper-left most point of the square that encompasses it
			* Generate a random x-axis point for circle
			* Use the diameter of the circle, not the radius to keep the entire circle on the canvas
			*/
			double x = generate.nextDouble(0, getWidth() - diam);
			//generate a random y-axis point for circle
			double y = generate.nextDouble(0, getHeight() - diam);
			
			
			/* Construct new circle with the randomly-generated x/y-axis
			 * Use diameter twice so the rectangle encompassing the oval will be square, 
			 * Making the oval a circle
			 * Each circle will have a color and the color will be randomly chosen
			 */
			GOval circle = new GOval(x, y, diam, diam);
			circle.setFilled(true);
			circle.setColor(generate.nextColor());
			add(circle);
		}
	}
}
