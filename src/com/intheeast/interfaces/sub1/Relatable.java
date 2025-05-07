package com.intheeast.interfaces.sub1;

public interface Relatable {

public int isLargerThan(Relatable other);
    
    double getArea();
    
    public static Object findLargest(Object object1, Object object2) {
 	   Relatable obj1 = (Relatable)object1;
 	   Relatable obj2 = (Relatable)object2;
 	   if (obj1.isLargerThan(obj2) > 0)
 	      return object1;
 	   else 
 	      return object2;
 	}
    
    public static Object findSmallest(Object object1, Object object2) {
    	   Relatable obj1 = (Relatable)object1;
    	   Relatable obj2 = (Relatable)object2;
    	   if ((obj1).isLargerThan(obj2) < 0)
    	      return object1;
    	   else 
    	      return object2;
    }
}
