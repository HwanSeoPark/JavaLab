package com.intheeast.interfaces;

import java.awt.Point;

public class UsingRelatableInterface {
	// static 메서드로 사용하면 이렇게 작성할 필요 없다
	
	private int width;
	private int height;	
	private Point point;
	private Relatable obj;
	
	public UsingRelatableInterface() {
		point = new Point(0, 0);
		width = 100;
		height = 100;
		obj = new RectanglePlus(point, width, height);
	}
	
 	public /*static*/ Object findLargest(Object obj) {
    	Relatable other = (Relatable)obj;
 	    if (this.obj.isLargerThan(other) > 0)
 	    	return this.obj;
 	    else 
 	        return other;
 	}
    
 	
    public /*static*/Object findSmallest(Object obj) {
        Relatable other = (Relatable)obj;
        	if (this.obj.isLargerThan(other) < 0)
        		return this.obj;
    	    else 
    	        return other;
    }
    
    
    public /*static*/boolean isEqual(Object obj) {
    		Relatable other = (Relatable)obj;
    		if ((this.obj).isLargerThan(other) < 0)
        		return true;
    	    else 
    	        return false;
    }
}
