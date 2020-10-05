import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;


public class DrawingLines extends GraphicsProgram {
	
	/* 
	 * Declare the line here so that the same line can be used in both methods that creates both parts of 
	 * the line (the point of origin and the end point)
	*/
	GLine rubberband;
	
	public void run() {
		addMouseListeners();
	}
		
	
	
	// This method creates the first part of the line: where the user clicks the mouse
	public void mousePressed(MouseEvent originPoint) {
		//These mark the coordinates (in pixels) of the point of origin where the user clicks the mouse
		double x = originPoint.getX();
		double y = originPoint.getY();
		
		/* 
		 *  Create a starting point for the line. By using GLine, you create just one point by using 
		 *  the same x/y-coordinates for both starting and ending points of the line.
		 */
		rubberband = new GLine(x, y, x, y);
		add(rubberband);
	}
	// This method creates a new line, using 
	public void mouseDragged(MouseEvent lineDrag) {
		
		double x = lineDrag.getX();
		double y = lineDrag.getY();
		
		rubberband.setEndPoint(x, y);
	}
 
}
