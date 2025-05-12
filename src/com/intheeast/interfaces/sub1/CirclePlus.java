package com.intheeast.interfaces.sub1;

import java.awt.Point;

import com.intheeast.interfaces.Relatable;

public class CirclePlus implements Relatable {

	  public Point origin;
	    private double radius;
	    
	    public CirclePlus(Point origin, double radius) {
	    	this.origin = origin;
	    	this.radius = radius;    	
	    }    

	    // Relatable의 abstract method를 구현함
	    public double getArea() {    	
	    	double area = Math.PI * this.radius * this.radius;
	        return area;
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
