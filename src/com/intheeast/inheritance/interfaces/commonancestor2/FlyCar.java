package com.intheeast.inheritance.interfaces.commonancestor2;

public interface FlyCar {

	// ...
    default public int startEngine() {
        // Implementation
    	return 0;
    }
}
