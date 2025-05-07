package com.intheeast.interfaces.sub1;

import java.awt.Point;

public class RectanglePlus implements Relatable {

	public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }
    public RectanglePlus(Point p) {
        origin = p;
    }
    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }
	
	public double getArea() {		
		return width * height;
	}
    
	public int isLargerThan(Relatable other) {
	        
	    	if (this.getArea() < other.getArea())
	            return -1;
	        else if (this.getArea() > other.getArea())
	            return 1;
	        else
	            return 0;               
	    }

}
